package com.atguigu.test;

public class Test8 {
    public static void main(String[] args) {
        Test8_1 t1 = new Test8_1();
        Test8_1 t2 = new Test8_1();
        Test8_1 t3 = new Test8_1();
        t1.start();
        t2.start();
        t3.start();
    }
}



class Test8_1 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            synchronized (Test8_1.class) {
                if (ticket > 0) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "窗口卖票，票号为：" + ticket--);
                } else break;
            }
        }
    }

}
