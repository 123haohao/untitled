package com.atguigu.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Window implements Runnable{
    private static int ticket = 100;

    ReentrantLock lock = new ReentrantLock();

    public void run(){
        while (true){
            try {
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "窗口，卖票：" + ticket--);
                } else break;
            }finally{
                lock.unlock();
            }
        }
    }




    public static void main(String[] args) {
        Window w1 = new Window();
        new Thread(w1).start();
        new Thread(w1).start();
        new Thread(w1).start();
    }
}
