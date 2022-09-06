package com.atguigu.method3;

//关于static的使用
public class Account {
    private int id;
    private double balance;
    private String pwd;

    private static double air;
    private static double minMonye;
    private static int init = 1000;

    public Account(){}
    public Account(double balance,String pwd,double air,double minMonye){
        this.id = init++;
        this.balance = balance;
        this.pwd = pwd;
        Account.air = air;
        Account.minMonye = minMonye;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getPwd() {
        return pwd;
    }

    public static double getAir() {
        return air;
    }

    public static double getMinMonye() {
        return minMonye;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static void setAir(double air) {
        Account.air = air;
    }

    public static void setMinMonye(double minMonye) {
        Account.minMonye = minMonye;
    }

    public String toString(){
        return "Account{" + "id = " + id + "\tbalance = " + balance + "\tair = " + air + "}";
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }if (obj instanceof Account){
            Account A = (Account) obj;
            return this.balance == A.balance;
        }
        return false;
    }
}

class AccountTest{
    public static void main(String[] args) {
        Account account = new Account(2000,"123456",0.012,100);
        Account account1 = new Account(2000,"666666",0.21,100);
        System.out.println(account.equals(account1));
        System.out.println(account);
        System.out.println(account1);
    }
}