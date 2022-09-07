package com.atguigu.shuqi;

public class test1 {
    public static void main(String[] args) {
        test3 t1 = new test3(1,"浩浩");
        test3 t2 = new test3(2,"沙伯");
        System.out.println(t1.getName());
        System.out.println("hot-fix");
        System.out.println("hello");
    }
}



class test3{
    int number;
    String name;
    public test3(){}
    public test3(int number,String name){
        this.name = name;
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
