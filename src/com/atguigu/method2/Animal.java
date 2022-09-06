package com.atguigu.method2;

public class Animal {
    public void eat(){
        System.out.println("动物爱吃食物");
    }
}


class dog extends Animal{
    private String name;
    private int age;

    public dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(age + "岁" + name + "爱吃骨头！");
    }
}

class cat extends Animal{
    private String name;
    private int age;

    public cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println(age + "岁" + name + "爱吃鱼！");
    }
}


class AnimalTest{
    public static void main(String[] args) {
       AnimalTest animalTest = new AnimalTest();
       animalTest.func(new cat("Tom",3));
       animalTest.func(new dog("emily",7));
    }

    public void func(Animal animal){
        animal.eat();
    }

}