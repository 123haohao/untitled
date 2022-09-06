package com.atguigu.multithreading;



//懒汉式线程安全模式
public class Lan {
    private Lan(){}

    private static Lan instance = null;

    public static Lan getInstance() {
        if (instance == null) {
            synchronized (Lan.class) {
                if (instance == null) {
                    instance = new Lan();
                }
            }
        }
        return instance;
    }


}

class Ttt{
    public static void main(String[] args) {
        Object i  = Lan.getInstance();
        System.out.println(i);
    }
}