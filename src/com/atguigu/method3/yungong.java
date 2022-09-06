package com.atguigu.method3;

import java.util.Calendar;

public abstract class yungong {
    private String name;
    private int id;
    private myDate1 birthday;

    public yungong(String name,int id,myDate1 birthday){
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public myDate1 getBirthday() {
        return birthday;
    }

    public void setBirthday(myDate1 birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    public String toString(){
        return "{name = " + name + "\tid = " + id + "\tbirthady" + birthday.toString() + "}";
    }
}

class myDate1{
    private int year;
    private int month;
    private int day;

    public myDate1(int year,int month,int day){
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

    public String toString(){
        return "year = " + year + "\tmonth = " + month + "\tday = " + day;
    }
}

class monthYuangong extends yungong{
    private double monthSalary;


    public monthYuangong(String name,int id,myDate1 birthday,double monthSalary){
        super(name,id,birthday);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public double earnings(){
        return monthSalary;
    }

    public String toString(){
        return "monthYuangong{" + super.toString() + "}";
    }


}


class hourYuangong extends yungong{
    private double wage;
    private double hour;


    hourYuangong(String name,int id,myDate1 birthday,double wage, double hour) {
        super(name, id, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double earnings(){
        return wage * hour;
    }

    public String toString(){
        return "hourYuangong{" + super.toString() + "}";
    }
}

class yuangongTest{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(calendar.MONTH);

        yungong[] yungongs = new yungong[2];

        yungongs[0] = new monthYuangong("Tom",1001,
                new myDate1(1996,1,26),12000);
        yungongs[1] = new hourYuangong("Hari",1001,
                new myDate1(2000,4,9),30,217);

        for (int i = 0;i < yungongs.length;i++){
            if (month + 1  == yungongs[i].getBirthday().getMonth()){
                System.out.println("生日快乐，奖励100元");
            }
        }
    }
}