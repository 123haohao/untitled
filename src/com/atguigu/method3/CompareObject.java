package com.atguigu.method3;

public interface CompareObject {
    //返回是0，代表当前相等，正数，代表当前对象大，负数，代表当前对象小
    int compareTo(Object o);

}


class circlee{
    private double radius;

    public void setRadius(){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public circlee(){}

    public circlee(double radius){
        this.radius = radius;
    }




}


class ComparableCircle extends circlee implements CompareObject{

    //实现了接口中的方法
    public int compareTo(Object o){
        if (this == o){
            return 0;
        }if (o instanceof circlee){
            circlee circlee = (circlee)o;
            return (this.getRadius() > circlee.getRadius())? 1 : -1;
        }else {
            throw new RuntimeException("传入的类型数据不匹配！");
        }
    }


    //构造器
    public ComparableCircle(double radius){
        super(radius);
    }
}


class InterfaceTest{
    public static void main(String[] args) {
        CompareObject c1 = new ComparableCircle(10);
        CompareObject c2 = new ComparableCircle(20);

        System.out.println(c1.compareTo(c2));
    }
}