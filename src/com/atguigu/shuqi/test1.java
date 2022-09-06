package com.atguigu.shuqi;

public class test1 {
    public static void main(String[] args) {
        test3 t = new test3(1,"浩浩");
        System.out.println(t.getName());
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
