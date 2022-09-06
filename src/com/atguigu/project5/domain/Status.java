package com.atguigu.project5.domain;

public class Status {


    private final String NAME;
    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VACATION = new Status("VACATION");

    private Status(String name){
        this.NAME = name;
    }

    public String getNAME() {
        return NAME;
    }
    public String toString(){
        return NAME;
    }
}
