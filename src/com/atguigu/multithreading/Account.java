package com.atguigu.multithreading;

import java.io.Serializable;

public class Account implements Serializable {


    private double balance;
    public  void deposit(double amt){
        if (amt > 0){
            synchronized (this) {
                balance += amt;
                System.out.println("存钱成功，余额为" + balance);
            }
        }
    }
}


class Customer extends Thread{
    private Account account;

    public Customer(Account account){
        this.account = account;
    }


    public void run(){
        for (int i = 0;i < 3;i++){
            account.deposit(1000);
        }
    }

}

class CustomerTest{
    public static void main(String[] args) {

        Account account = new Account();

        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        c1.start();
        c2.start();



    }
}