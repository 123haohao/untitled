package com.atguigu.method2;

import org.junit.Test;

public class wrapperTest {


    @Test
    public void test(){


        int c = 10;
        Integer d = new Integer(10);

        //jdk5.0以后
        //自动装箱
        int a = 1;
        Integer i = a;

        //自动拆箱
        int b = i;

        Byte b1 = new Byte("12");

        //基本数据类型转String类
        String info = String.valueOf(b1);

        //String转包装类转基本数据类型
        int p = Integer.parseInt(info);

        System.out.println(p);





    }
}
