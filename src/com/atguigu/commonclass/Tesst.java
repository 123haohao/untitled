package com.atguigu.commonclass;

import java.util.Arrays;
import java.util.Comparator;

public class Tesst {
    public static void main(String[] args) {
        String[] str = new String[]{"AE","AB","AP","FD","AD","BF"};

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));


        person[] s = new person[3];
        s[0] = new person("d",23);
        s[1] = new person("d",22);
        s[2] = new person("a",23);

        Arrays.sort(s, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                if (o1.getName().equals(o2.getName())){
                    return -Integer.compare(o1.getAge(),o2.getAge());
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });


        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(str));

        System.out.println(Arrays.toString(s));

    }
}


class person implements Comparable{
    private String name;
    private int age;

    public person(){}
    public person(String name,int age){
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
    public int compareTo(Object o) {
        if (o instanceof person){
            person s = (person) o;
            if (this.age > s.age){
                return 1;
            }else if (this.age < s.age){
                return -1;
            }else{
                return this.name.compareTo(s.name);
            }
        }
        throw new RuntimeException("传入的类型不一致!");
    }


    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}