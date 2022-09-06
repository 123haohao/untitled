package com.atguigu.method2;

public class GeometricObject {
    protected String color;
    protected double weight;


    protected GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0;
    }
}

class circl extends GeometricObject{
    private double radius;

    public circl(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
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

    public boolean equals(Object o){
        if (this == o){
            return true;
        }if (o instanceof circl){
            circl c = (circl) o;
            return this.getRadius() == c.getRadius();
        }
        return false;
    }

    public String toString(){
        return "circl{" + "radius = " + radius + "}";
    }
}

class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width,double height,String color,double weigth){
        super(color,weigth);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double findArea(){
        return weight * height;
    }
}


class GeometricTest{
    public static void main(String[] args) {
        circl c = new circl(10,"yellow",15);
        MyRectangle m = new MyRectangle(20,10,"green",10);
        GeometricTest test = new GeometricTest();
        test.equalsArea(c,m);
        test.displayGeometricObject(m);
        System.out.println(c.toString());

    }


    public void equalsArea(GeometricObject o1,GeometricObject o2){
        System.out.println(o1.findArea() == o2.findArea());
    }

    public void displayGeometricObject(GeometricObject o){
        System.out.println(o.findArea());
    }

}
