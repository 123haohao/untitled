package com.atguigu.enumeration;

import java.util.ArrayList;
import java.util.Date;

public class Test123 extends tesss{
    @Override//对方法进行校验，是否是重写
    public void show() {
        super.show();
    }
    @Deprecated//new Date的小横线没有了
    Date date = new Date("2002");

    @SuppressWarnings("unused")//编译器不警告，num亮了
    int num = 1;

    public static void main(String[] args) {
    }
}

class tesss{
    public void show(){}
    ArrayList arrayList = new ArrayList<>();
}