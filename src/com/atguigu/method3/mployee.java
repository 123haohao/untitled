package com.atguigu.method3;

import java.util.Calendar;

//抽象类的总和使用
public abstract class mployee {
    private String name;
    private int number;
    private MyDate birthday;

    public mployee(String name,int number,MyDate birthday){
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", number = " + number +
                ", birthday = " + birthday.toString();
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int month,int day){
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
        return year + "year\t" + month + "month\t" + day + "day";
    }
}



class salairedEmployee extends mployee{
    private double monthlySalary;

    public salairedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySaraly() {
        return monthlySalary;
    }

    public void setMonthlySaraly(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public String toString(){
        return "salairedEmployee[" + super.toString() +"]";
    }
}


class HourlyEmployee extends mployee{
    private double wage;
    private double hour;

    public HourlyEmployee(String name,int number,MyDate birthday,double wage,double hour){
        super(name,number,birthday);
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

    @Override
    public double earnings() {
        return wage * hour;
    }

    public String toString(){
        return "HourlyEmployee[" + super.toString() + "]";
    }
}

class PayrollSystem{
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(calendar.MONTH);

        mployee[] mployees = new mployee[2];

        mployees[0] = new salairedEmployee("Tom",1001,
                new MyDate(1996,12,6),10000);

        mployees[1] = new HourlyEmployee("Hari",1002,
                new MyDate(2000,4,29),30,210);

        for(int i = 0;i < mployees.length;i++){
            System.out.println(mployees[i] + "\t月薪：" + mployees[i].earnings());

            if (month + 1 == mployees[i].getBirthday().getMonth()){

                System.out.println(mployees[i].getName() + "员工生日奖励100元");

            }
        }
    }
}

