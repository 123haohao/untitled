package com.atguigu.enumeration;

public class Custom {
    //1.声明Custom对象的属性：private final;
    private final String Season;
    //2.私有化构造器，并给对象属性赋值
    private Custom(String name){
        this.Season = name;
    }

    //3.提供当前枚举类的多个对象
    public static final Custom SPRING = new Custom("春天");
    public static final Custom SUMMER = new Custom("夏天");
    public static final Custom FALL = new Custom("秋天");
    public static final Custom WINTER = new Custom("冬天");



    //4.其他诉求
    public String getSeason(){
        return Season;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "Season='" + Season + '\'' +
                '}';
    }
}


class Test{
    public static void main(String[] args) {
        //通过类调出来属性
        Custom spring = Custom.SPRING;
        System.out.println(spring);
    }
}