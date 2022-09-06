package com.atguigu.stream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class wrStream {
    @Test
    public void wrs(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File("C:\\Users\\123\\Desktop\\1.jpg");
            File file2 = new File("C:\\Users\\123\\Desktop\\2.jpg");

            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            byte[] buffer = new byte[5];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null){
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

    }
}
