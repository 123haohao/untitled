package com.atguigu.method3;


//抽象类可以定义事务的属性
public abstract class Door {
    private double heigth;
    private double width;

    public abstract void open();
    public abstract void close();

    public Door(){}
    public Door(double heigth,double width){
        this.heigth = heigth;
        this.width = width;
    }

}
//
interface Alarm{
    void alarm();
}

class PanPanDoor extends Door implements Alarm{
    public void open(){
        System.out.println("开门");
    }
    public void close(){
        System.out.println("关门");
    }
    public void alarm(){
        System.out.println("报警");
    }

    public PanPanDoor(double height,double width){
        super(height,width);
    }
}

class MeiXinDoor extends Door{
    public void open(){
        System.out.println("开门");
    }
    public void close(){
        System.out.println("关门");
    }
    public MeiXinDoor(double height,double width){
        super(height,width);
    }
}

class testt{
    public static void main(String[] args) {
        PanPanDoor p1 = new PanPanDoor(200,120);
        MeiXinDoor p2 = new MeiXinDoor(200,120);
        p1.alarm();
        p2.open();

    }
}