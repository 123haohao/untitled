package com.atguigu.test;

public class Test7 {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }

}


class Window implements Runnable{

    private int ticket = 100;
    @Override
    public synchronized void run()  {
        while(true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + "窗口卖票，票号为：" + ticket--);
            }else break;
        }
    }

}