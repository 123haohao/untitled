package com.atguigu.project4.service;

public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VACATION = new Status("VACATION");

    public String getNAME() {
        return NAME;
    }
    public String toString(){
        return NAME;
    }
}
