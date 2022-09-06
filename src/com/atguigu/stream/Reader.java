package com.atguigu.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader{
    @Test
    public void readerTest(){
        FileReader fr = null;
        try {
            //1.实例化File的对象，指明要操作的文件
            File file = new File("huh1.txt");
            //2.提供具体的流
            fr = new FileReader(file);
            //3.数据的读入
            int l;
            while ((l = fr.read()) != -1) {
                System.out.print((char) l);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            //4.流的关闭操作
            if (fr != null){
                try{
                    fr.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
