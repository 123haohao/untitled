package com.atguigu.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    @Test
    public void writer(){
        FileWriter wr = null;
        try {
            //1.提供File类的对象，指明写出的文件
            File file = new File("C:\\Users\\123\\Desktop\\hello.txt");
            //2.提供具体的流
            wr = new FileWriter(file);
            //3.写入操作
            wr.write("i have a dream");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (wr != null) {
                try {
                    wr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
