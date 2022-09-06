package com.atguigu.stream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomTest {
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        RandomAccessFile raf1 = null;
        try {
            //
            raf = new RandomAccessFile(
                    new File("C:\\Users\\123\\Desktop\\IO\\hello1.txt"),"r");//只读
            raf1 = new RandomAccessFile(
                    new File("C:\\Users\\123\\Desktop\\IO\\hello5.txt"),"rw");//读写

            byte[] buf = new byte[1024];
            int len;
            while ((len = raf.read(buf)) != -1){
                raf1.write(buf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf != null){

                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}


class RandomTest1{
    public static void main(String[] args) {
        RandomAccessFile raf = null;
        try {
            //1.
            raf = new RandomAccessFile(
                    new File("C:\\Users\\123\\Desktop\\IO\\hello5.txt"),"rw");
            raf.seek(5);//移动到指定位置
            raf.write("i when".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf != null){
                try {
                    raf.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}