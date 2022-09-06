package com.atguigu.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Account1 {


    private double balance;
    ReentrantLock lock = new ReentrantLock();


    public  void deposit(double amt){
        if (amt > 0){
            try {
                lock.lock();
                Thread.sleep(100);
                balance += amt;
                System.out.println(Thread.currentThread().getName() + "存钱成功，余额为：" + balance);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            finally{
                lock.unlock();
            }
        }
    }
}

class Customer1 implements Runnable{

    private Account1 account1;

    public Customer1(Account1 account1){
        this.account1 = account1;
    }


    public void run(){
        for (int i = 0;i < 3;i++){
            account1.deposit(1000);
        }
    }
}



class CustomerTest1{
    public static void main(String[] args) {
        Account1 account1 = new Account1();
        Customer1 c1 = new Customer1(account1);

        new Thread(c1).start();
        new Thread(c1).start();
    }
}