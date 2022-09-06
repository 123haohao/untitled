package com.atguigu.multithreading;

public class Test {
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo1 t2 = new ThreadDemo1();
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
