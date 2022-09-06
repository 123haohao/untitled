package com.atguigu.stream;

import java.io.*;

public class TransCoding {
    public static void main(String[] args) {
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            //
            File file1 = new File("C:\\Users\\123\\Desktop\\hello.txt");
            File file2 = new File("C:\\Users\\123\\Desktop\\helloo.txt");

            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            isr = new InputStreamReader(fis,"utf-8");
            osw = new OutputStreamWriter(fos,"gbk");

            char[] cbuf = new char[5];
            int len;
            while ((len = isr.read(cbuf)) != -1){
                osw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
