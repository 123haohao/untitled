package com.atguigu.multithreading;


//生产者消费者，wait，notify
class clerk{
    private int commodity;

    public void production(){
        while (true){
            synchronized(this) {
                if (commodity < 20) {
                    System.out.println(Thread.currentThread().getName() + ":开始生产第" + ++commodity);
                    notify();
                } else{
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void consumption(){
        while (true) {
            synchronized (this) {
                if (commodity > 0) {
                    System.out.println(Thread.currentThread().getName() + ":开始消费第" + commodity--);
                    notify();
                }else {
                    try {
                        wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}


class produce extends Thread{
    private clerk clerk;
    public produce(clerk clerk){
        this.clerk = clerk;
    }

    public void run(){
        clerk.production();
    }
}



class consumer extends Thread{
    private clerk clerk;
    public consumer(clerk clerk){
        this.clerk = clerk;
    }

    public void run(){
        clerk.consumption();
    }
}






public class consumerTest {
    public static void main(String[] args) {
        clerk c =  new clerk();
        produce p = new produce(c);
        consumer m = new consumer(c);

        p.setName("生产者");
        m.setName("消费者");

        p.start();
        m.start();
    }

}
