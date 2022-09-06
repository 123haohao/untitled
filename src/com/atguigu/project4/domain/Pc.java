package com.atguigu.project4.domain;

public class Pc implements Equipment{
    private String name;
    private String display;//显示屏


    public Pc(){}
    public Pc(String name,String display){
        this.name = name;
        this.display = display;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getToString(){
        return name + "(" + display + ")";
    }
}
