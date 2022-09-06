package com.atguigu.enumeration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        //添加一个元素
        coll.add("dhfga");
        coll.add(123);//自动装箱，只能添加对象

        Collection coll1 = new ArrayList();
        coll1.add(new Date(23480804332L));

        //添加一个集合
        coll.addAll(coll1);
        //显示元素的个数
        System.out.println(coll.size());
        //显示元素内容
        System.out.println(coll);

        //清空集合元素
        coll.clear();
        coll1.clear();

        //判断集合元素是否为空，返回boolean
        System.out.println(coll.isEmpty());

        coll.add(new String("add"));
        coll.add(123);
        //判断当前集合是否包含obj，用的是obj的equals，返回boolean
        System.out.println(coll.contains("add"));
        System.out.println(coll);

        coll1.add(new String("add"));
        System.out.println(coll1);
        //判断当前集合是否包含obj集合，返回boolean
        System.out.println(coll.containsAll(coll1));



    }
}
