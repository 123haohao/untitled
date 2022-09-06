package com.atguigu.project5.domain;

public class PC implements Equipment{

    private String name;
    private String display;

    public PC(){}
    public PC(String name,String display){
        this.name = name;
        this.display = display;
    }


    public String getToString(){
        return name + "(" + display + ")";
    }
}
