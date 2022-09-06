package com.atguigu.test;

public class Test4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void method(int a,int b){
        a = 100;
        b = 200;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.exit(0);
    }
}
