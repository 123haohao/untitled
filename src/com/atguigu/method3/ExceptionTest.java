package com.atguigu.method3;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            String jj = "123l";
            System.out.println("开始");
            int number = Integer.parseInt(jj);
        } catch (RuntimeException o) {
            System.out.println(o.getMessage());
            System.out.println("结束");
        }

    }
}
