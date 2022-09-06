package com.haohao.project3.domain;

public class Pc implements Equipment{
    private String model;//机器型号
    private String display;//显示器名称

    public Pc(){}
    public Pc(String model,String display){
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDescirption(){
        return model + "(" + display + ")";
    }

}
