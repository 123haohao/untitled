package com.atguigu.project5.domain;

public class Student {
    private int id;
    private String name;
    private int age;
    private int la;//学习能力

    public Student(){}
    public Student(int id,String name,int age,int la){
        this.id = id;
        this.name = name;
        this.age = age;
        this.la = la;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLa() {
        return la;
    }

    public void setLa(int la) {
        this.la = la;
    }


    public String getString(){
        return id + "\t\t" + name + "\t" + age + "\t\t" + la;
    }

    public String toString(){
        return getString();
    }


}
