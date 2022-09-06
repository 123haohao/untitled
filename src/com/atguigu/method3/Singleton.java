package com.atguigu.method3;

//饿汉式
public class Singleton {

    private Singleton(){}

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}

//懒汉式
class Singleton1{
    private Singleton1(){}

    private static Singleton1 singleton1 = null;


    //需要判断，线程不安全
    public static Singleton1 getInstance(){
        if (singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}


class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}