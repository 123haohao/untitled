package com.atguigu.method1;

import com.atguigu.project2.CMUtility;
import com.atguigu.project2.Customer;
import com.atguigu.project2.CustomerList;

public class test {
    private CustomerList customerList = new CustomerList(10);
    public test(){
        com.atguigu.project2.Customer customer = new Customer("浩浩",32,'男',"343223","432423");
        customerList.addCustomer(customer);
    }


    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag) {
            System.out.println("-----------------客户信息管理软件----------------\n");
            System.out.println("                 1 添加客户");
            System.out.println("                 2 修改客户");
            System.out.println("                 3 删除客户");
            System.out.println("                 4 客户列表");
            System.out.println("                 5 退   出\n");
            System.out.println("请输入(1~5)：");
            int menu = CMUtility.readMenuSelection();
            switch(menu){
                case '1':
                    addCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("是否确认退出(Y/N)：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
            }
        }
    }
    public void addCustomer(){
        System.out.println("------------------添加客户-----------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(11);
        System.out.println("邮箱：");
        String email = CMUtility.readString(15);
        com.atguigu.project2.Customer customer = new Customer(name,age,gender,phone,email);
        boolean s = customerList.addCustomer(customer);
        if (s){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
    }
    public void modifyCustomer(){
        System.out.println("-----------------修改客户------------------");
        int number;
        com.atguigu.project2.Customer customer;
        for (;;){
            System.out.println("请输入客户编号(-1)退出：");
            number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            customer = customerList.getCustomer(number - 1);
            if(customer == null){
                System.out.println("");
            }else {
                break;
            }
        }
        customer = customerList.getCustomer(number - 1);
        System.out.println("姓名：");
        String name = CMUtility.readString(10,customer.getName());
        System.out.println("性别：");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.println("年龄：");
        int age = CMUtility.readInt(customer.getAge());
        System.out.println("电话：");
        String phone = CMUtility.readString(11,customer.getPhone());
        System.out.println("邮箱：");
        String email = CMUtility.readString(15,customer.getEmail());
        com.atguigu.project2.Customer newcus = new Customer(name,age,gender,phone,email);
        boolean isReplace = customerList.replaceCustomer(number - 1,newcus);
        if (isReplace){
            System.out.println("修改成功！");
        }else {
            System.out.println("修改失败!");
        }
    }
    public void deleteCustomer(){
        System.out.println("---------------删除客户-----------------");
        int number;
        com.atguigu.project2.Customer customer;
        for (;;){
            System.out.println("请输入客户编号(-1退出)：");
            number = CMUtility.readInt();
            if(number == -1){
                return;
            }
            customer = customerList.getCustomer(number - 1);
            if (customer == null){
                System.out.println("找不到指定客户！");
            }else {
                break;
            }
        }
        boolean isDelete = customerList.deleteCustomer(number - 1);
        if (isDelete){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
    }
    public void listAllCustomer(){
        System.out.println("-------------------客户列表------------------");
        int total = customerList.getTotal();
        if (total <= 0){
            System.out.println("没有客户!");
        }
        com.atguigu.project2.Customer[] cust = customerList.getAllCustomer();
        for (int i = 0;i < cust.length;i++){
            com.atguigu.project2.Customer c = cust[i];
            System.out.println("number" + "\tname" + "\tgender" + "\tage" + "\t\tphone" + "\t\temail");
            System.out.println((i + 1) + "\t\t" + c.getName() + "\t\t" + c.getGender() + "\t" +
                    c.getAge() + "\t\t" + c.getPhone() + "\t\t" + c.getEmail());
        }
    }
    public static void main(String[] args){
        test test = new test();
        test.enterMainMenu();
    }
}
