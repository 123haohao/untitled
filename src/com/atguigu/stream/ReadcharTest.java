package com.atguigu.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadcharTest {
    @Test
    public void read(){
        FileReader fr = null;
        try {
            //1.实例化File的对象，指明要操作的文件
            File file = new File("huh.txt");
            //2.提供具体的流
            fr = new FileReader(file);
            //3.数据的读入，用char数组读，数组的长度为读取的容量
            int len;
            char[] cbuf = new char[5];
            while((len = fr.read(cbuf)) != -1){
                for (int i = 0;i < len;i++){
                    System.out.print(cbuf[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            if (fr != null)
                try {
                    fr.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
        }
    }
}
