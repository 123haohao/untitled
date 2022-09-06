package com.atguigu.enumeration;

interface info{
    void show();
}

//使用enum关键字定义枚举类
public enum Person implements info{
    //1.提供当前类的对象，多个对象之间","隔开，末尾对象用";"结束
    Man("男人"){
        @Override
        public void show() {
            System.out.println("男人赚钱");
        }
    },
    Woman("女人"){
        @Override
        public void show() {
            System.out.println("女人花钱");
        }
    };

    //2.声明Person对象的属性：private final 修饰
    private final String gender;

    //3.私有化构造器，并给对象的属性赋值
    private Person(String name){
        this.gender = name;
    }

    //4.其他述求


    public String getGender() {
        return gender;
    }
}


class PersonTest{
    public static void main(String[] args) {
        Person man = Person.Man;
        System.out.println(man);
        System.out.println("--------------");
        Person[] values = Person.values();
        for (int i = 0; i < values.length; i++) {
            values[i].show();
        }
        Person man1 = Person.valueOf("Man");
        System.out.println(man1);




    }
}