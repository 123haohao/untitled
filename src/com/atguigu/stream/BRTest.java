package com.atguigu.stream;

import java.io.*;

public class BRTest {
    public static void main(String[] args) {
        BufferedReader bfr = null;
        BufferedWriter bfw = null;
        try {
            bfr = new BufferedReader(new FileReader(new File("C:\\Users\\123\\Desktop\\hello.txt")));
            bfw = new BufferedWriter(new FileWriter(new File("C:\\Users\\123\\Desktop\\hello2.txt")));

//            char[] cbuf = new char[1024];
//            int len;
//            while ((len = bfr.read(cbuf)) != -1){
//                bfw.write(cbuf,0,len);
            String data;
            while ((data = bfr.readLine()) != null){
                bfw.write(data);
                bfw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bfr != null){
                try {
                    bfr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bfw != null){
                try {
                    bfw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
