package com.atguigu.project4.service;

public class TeamException extends Exception{

    static final long serialVersionUID = -3387516993124239948L;

    public TeamException(){
    }
    public TeamException(String message){
        super(message);
    }
}
