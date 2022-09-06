package com.atguigu.stream;

import com.atguigu.multithreading.Account;
import org.junit.Test;

import java.io.*;

public class ObjectTest {
    @Test
    public void ObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("huh.txt"));

            oos.writeObject(new Person("Tom",23,new Account()));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void ObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("huh.txt"));

            Object obj = ois.readObject();
            System.out.println(obj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null){

                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Person implements Serializable{
    public static final long serialVersionUID = 423242342399L;
    private String name;
    private int age;
    private Account account;

    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name,int age,Account account){
        this(name, age);
        this.account = account;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
