package com.atguigu.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WRTest {
    @Test
    public void wr(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入的文件
            File file1 = new File("C:\\Users\\123\\Desktop\\hello.txt");
            File file2 = new File("C:\\Users\\123\\Desktop\\hello1.txt");
            //2.创建输入流和输出流的对象
            fr = new FileReader(file1);
            fw = new FileWriter(file2);

            //3.数据的读入和写入操作
            int i;//记录每次读入到数组中的个数
            char[] cbuf = new char[5];
            while((i = fr.read(cbuf)) != -1){
                //每次写入i个字符
                fw.write(cbuf,0,i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关关闭流的操作
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        fr.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
