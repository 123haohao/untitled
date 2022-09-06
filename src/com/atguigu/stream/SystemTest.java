package com.atguigu.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemTest {
    public static void main(String[] args) {
        BufferedReader bfr = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            bfr = new BufferedReader(isr);

            while(true){
                System.out.println("请输入字符串：");
                String data = bfr.readLine();

                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)){
                    System.out.println("程序退出！");
                    break;
                }
                String toUpperCase = data.toUpperCase();
                System.out.println(toUpperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bfr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
