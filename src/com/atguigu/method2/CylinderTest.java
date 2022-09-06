package com.atguigu.method2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new     Cylinder();
        cylinder.setRadius(10);
        cylinder.setLength(20);
        System.out.println(cylinder.findVolume());
        cylinder.eats();
        cylinder.eat("喜欢你");
    }
}

class Circle{
    private double radius;

    public Circle(){
        radius = 1;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        return Math.PI * radius * radius;
    }
    public void eat(){
        System.out.println("吃饭");
    }


}


class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        length = 1;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public double findVolume(){
        return findArea() * length;
    }
    public void eat(){
        System.out.println("我先要吃banana");
    }
    public void eat(String d){
        System.out.println("我" + d);
    }
    public void eats(){
        super.eat();
    }
}