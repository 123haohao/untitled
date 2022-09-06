package com.atguigu.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void CopyFile(String src,String dest){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File(src);
            File file2 = new File(dest);

            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            int len;
            byte[] buffer = new byte[1024];
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void time(String src,String dest){
        long start = System.currentTimeMillis();
        CopyFile(src,dest);
        long end = System.currentTimeMillis();
        System.out.println("复制的时间毫秒为" + (end - start));
    }

    @Test
    public void test(){
        time("C:\\Users\\123\\Desktop\\1.mp4","C:\\Users\\123\\Desktop\\2.mp4");
    }
}


