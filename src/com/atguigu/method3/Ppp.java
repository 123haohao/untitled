package com.atguigu.method3;

public interface Ppp {
    default void eat(){
        System.out.println("吃");
    }
}
interface III{
    default void eat(){
        System.out.println("吃1");
    }
}



class TTT implements Ppp,III{
    public void eat(){

    }
}
