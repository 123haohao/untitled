package com.atguigu.project5.domain;

public class Printer implements Equipment{
    private String name;
    private String type;

    public Printer(){}
    public Printer(String name,String type){
        this.name = name;
        this.type = type;
    }


    public String getToString(){
        return name + "(" + type + ")";
    }
}
