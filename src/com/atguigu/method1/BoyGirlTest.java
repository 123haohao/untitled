package com.atguigu.method1;

//set,get方法的创建，构造器的创建使用，属性的值比较大小

public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy = new Boy("浩浩",20);
        Girl girl = new Girl("香香",20);
        Girl girl1 = new Girl("菜菜",23);
        int age = girl.compare(girl1);
        girl.marry(boy);
        if (age > 0){
            System.out.println(girl.getName() + "大");
        }else if (age < 0){
            System.out.println(girl1.getName() + "大");
        }else{
            System.out.println("一样大");
        }
    }

}
class Boy{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void marry(Girl girl){
        System.out.println("我想娶 " + girl.getName());
    }
    public void shout(){
        if(this.age >= 22){
            System.out.println("你可以去结婚登记了");
        }else{
            System.out.println("做个海王");
        }
    }
    public Boy(){}
    public Boy(String name,int age){
        this.name = name;
        this.age = age;
    }

}

class Girl{
    private String name;
    private int age;

    public Girl(){}
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void marry(Boy boy){
        System.out.println("我想嫁 " + boy.getName());
        boy.marry(this);
    }
    public int compare(Girl girl){
        return this.age - girl.age;
    }
}