package com.atguigu.multithreading;

public class ThreadDemo1 implements Runnable{
    public void run(){
        for (int i = 0;i < 100;i++){
            if (i % 2 != 0) System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
