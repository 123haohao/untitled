package com.atguigu.method1;

//银行给客户开账户取钱
class AccountTest{
    public static void main(String[] args) {
        Bank bank = new Bank(10);
        bank.addCustomer(new Customer("hao"));
        bank.getCustomer(0).setAccount(new Account(2000));
        double in = bank.getCustomer(0).getAccount().getBalance();
        System.out.println(in);
    }
}

class Account{
    private double balance;

    public Account(double balance){

        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }



    public void withdraw(double amount){
        if (balance >= amount){
            System.out.println("取款成功！");
            balance -= amount;
        }else {
            System.out.println("余额不足！");
        }
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }
}

class Customer{
    private String name;
    private Account account;

    public Customer(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

class Bank{
    private Customer[] customers;
    private int total;

    public Bank(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    public void addCustomer(Customer customer){
        if (total >= customers.length){
            System.out.println("添加失败！");
        }
        customers[total++] = customer;
    }

    public Customer getCustomer(int index){
        if (index < 0 || index  >= total){
            System.out.println("找不到指定客户！");
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }
}

