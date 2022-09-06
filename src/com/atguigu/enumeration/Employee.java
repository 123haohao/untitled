package com.atguigu.enumeration;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Employee{
    private String name;
    private int age;
    private MyData myData;
    public Employee(){}
    public Employee(String name,int age,MyData myData){
        this.name = name;
        this.age = age;
        this.myData = myData;
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

    public MyData getMyData() {
        return myData;
    }

    public void setMyData(MyData myData) {
        this.myData = myData;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myData=" + myData +
                '}';
    }

    public static void main(String[] args) {
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getMyData().compareTo(o2.getMyData());
            }
        });
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Employee && o2 instanceof Employee){
//                    Employee p1 = (Employee) o1;
//                    Employee p2 = (Employee) o2;
//                    MyData m1 = p1.getMyData();
//                    MyData m2 = p2.getMyData();
//                    return m1.compareTo(m2);
//
//                }
//                throw new RuntimeException("传入的类型不一致!");
//            }
//        });


        set.add(new Employee("杨颖",18,new MyData(1989,8,19)));
        set.add(new Employee("白鹿",18,new MyData(1994,3,22)));
        set.add(new Employee("吴宣仪",18,new MyData(1995,2,7)));
        set.add(new Employee("杨超越",18,new MyData(1998,11,4)));
        set.add(new Employee("张子枫",18,new MyData(2001,7,28)));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}



class MyData implements Comparable<MyData>{
    private int year;
    private int month;
    private int day;

    public MyData(){}

    public MyData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }


    @Override
    public int compareTo(MyData o) {
        int minYear = this.year - o.year;
        if (year != 0){
            return -year;
        }
        int minMonth = this.month - o.month;
        if (minMonth != 0){
            return -minMonth;
        }
        int minDay = this.day - o.day;
        if (minDay != 0){
            return -minDay;
        }
        return 0;
    }
}