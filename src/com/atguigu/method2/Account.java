package com.atguigu.method2;

public class Account {
    private int id;
    private double balance;
    private double air;

    public Account(int id,double balance,double air){
        this.id = id;
        this.balance = balance;
        this.air = air;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAir() {
        return air;
    }

    public void setAir(double air) {
        this.air = air;
    }

    public double getMonthlyInterest(){
        return air / 12;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            this.balance -= amount;
            System.out.println("成功取出：" + amount);
        }else {
            System.out.println("余额不足!");
        }
    }
    public void deposit(double amount){
        if (amount > 0){
            System.out.println("成功存入：" + amount);
            this.balance += amount;
        }
    }
}


class CheckAccount extends Account{
    //剩余额度
    private double overdraft;

    public CheckAccount(double overdraft,int id,double balance,double air){
        super(id,balance,air);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount){
        if (getBalance() >= amount){
            System.out.println("成功取出：" + amount);
            super.withdraw(amount);
        }else if (overdraft >= amount - getBalance()){
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        }else {
            System.out.println("别借了！");
        }
    }

    public double getOverdraft(){
        return overdraft;
    }
}



class AccountTest{
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(20000,1122
                ,2000,0.0123);
        checkAccount.withdraw(30000);
        System.out.println(checkAccount.getBalance() + "\t" + checkAccount.getOverdraft());
    }
}