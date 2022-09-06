package com.atguigu.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class r implements Runnable{
    public void run(){
        for (int i = 0;i < 100;i++){
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

class c implements Callable {
    public Integer call(){
        for (int j = 0;j < 100;j++){
            if (j % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + j);
            }
        }
        return null;
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new r());//适用于Runnable
        service.submit(new c());//适用于Callable

        service.shutdown();

    }
}
