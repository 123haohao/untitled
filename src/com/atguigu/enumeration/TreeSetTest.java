package com.atguigu.enumeration;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Personn && o2 instanceof Personn){
                    Personn p1 = (Personn) o1;
                    Personn p2 = (Personn) o2;

                    return p1.getName().compareTo(p2.getName());
                }
                else throw new RuntimeException("输入的类型不一致！");
            }
        };
        TreeSet set = new TreeSet(com);
        set.add(new Personn("Tom",12));
        set.add(new Personn("Mack",33));
        set.add(new Personn("Mear",18));
        set.add(new Personn("Tom",33));
        System.out.println(set);
    }
}

class Personn implements Comparable{
    private String name;
    private int age;

    public Personn(){}

    public Personn(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "name = " + name + ",age = " + age;
    }


    @Override
    public int compareTo(Object o){
        if (o instanceof Personn){
            Personn p = (Personn) o;
            int i = this.name.compareTo(p.name);
            if (i == 0){
                return new Integer(this.age).compareTo(((Personn) o).age);
            }else {
                return i;
            }
        }else throw new RuntimeException("传入的参数类型不一致！");
    }
}