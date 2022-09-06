package com.atguigu.method3;

//实现类实现多个接口
public interface intefaceTest {
    int age = 18;
    void eat();

}


interface ppImpl{
    void wilk();
}
class Person implements intefaceTest,ppImpl{

    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void wilk(){
        System.out.println("人会走路");
    }

}

class PersonTest{
    public static void main(String[] args) {
        Person i = new Person();
        i.eat();
        i.wilk();
        System.out.println(intefaceTest.age);
    }

}