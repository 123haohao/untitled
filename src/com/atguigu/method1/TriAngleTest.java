package com.atguigu.method1;

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngel Tri = new TriAngel(3.5,6);
        System.out.println(Tri.getBase() + "\t" + Tri.getHeight());
        System.out.println(Tri.value(5.0,6));
    }
}

class TriAngel{
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public double value(double i,double j){
        return i * j / 2;
    }
    public TriAngel(double i,double j){
        base = i;
        height = j;
    }
    public TriAngel(){

    }
}
