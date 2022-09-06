package com.atguigu.stream;

import java.io.*;

public class BufferTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        test();
        long end = System.currentTimeMillis();

        System.out.println("复制的时间毫秒为" + (start - end));
    }

    public static void test(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.提供File类的对象，指明写出的文件
            File file1 = new File("C:\\\\Users\\\\123\\\\Desktop\\\\1.mp4");
            File file2 = new File("C:\\\\Users\\\\123\\\\Desktop\\\\2.mp4");

            //2.1造结点流
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);
            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            //3.数据的读入和写入操作
            int len;
            byte[] buffer = new byte[1024];
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.先关外面流，里面的流也会自动关闭
            if (bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
