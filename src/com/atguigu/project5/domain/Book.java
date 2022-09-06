package com.atguigu.project5.domain;

public class Book implements Equipment{
    private String name;
    private double price;

    public Book(){}
    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getToString(){
        return name + "(" + price + ")";
    }
}
