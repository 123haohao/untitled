package com.atguigu.method3;

public abstract class Animal {
    public abstract void eat();
}


class Dog extends Animal{
    public void eat(){
        System.out.println("吃饭");
    }
}

class test{
    public static void main(String[] args) {
        test t = new test();
       //非匿名对象，匿名子类
        Animal a = new Animal() {
            public void eat() {
                System.out.println("吃东西");
            }
        };
        t.method1(a);
        //匿名对象，匿子名类
        t.method1(new Animal() {
            public void eat() {
                System.out.println("好好呼吸");
            }
        });
    }


    public void method1(Animal a){
        a.eat();
    }
}