package com.atguigu.method2;

public class Person {
    private String name;
    private char sex;
    private int age;
    public Person(String name,char sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Person(){}
    public String toString(){
        return name + sex + age;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}


class Student extends Person{
    long number;
    int math;
    int english;
    int computer;

    public static void main(String[] args){
        Student student = new Student("黄浩",'男',23,1,66,23,43);
        System.out.println(student.avg());
        System.out.println(student.max());
        System.out.println(student.min());
        System.out.println(student.toSting());
    }
    public Student(String name,char sex,int age,long number,int math,int english,int computer){
        super(name, sex, age);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public double avg(){
        return (math + english + computer) / 3;
    }

    public int max(){
        return (math > english)? (math > computer)? math : computer : (english > computer)? english : computer;
    }

    public int min(){
        return (math < english)? (math < computer)? math : computer : (english < computer)? english : computer;
    }
    public String toSting(){
        return super.getName() + "\t性别 " + super.getSex() + "\t年龄" + super.getAge()
                + "\t编号" + number + "\t数学" + math + "\t英语" + english +
                "\t计算机" + computer;
    }
}

