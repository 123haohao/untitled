package com.atguigu.enumeration;

import java.util.*;

public class CollectionTest1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Collection c1 = new ArrayList();
        c.add(123);
        c.add(456);
        c.add(789);
        //删除指定元素，先用equals查找删除，返回boolean
        System.out.println(c.remove(123));

        c1.add(456);
        //删除是否包含的集合，删除等于求差集，返回boolean
        System.out.println(c.removeAll(c1));


        //求交集，保留一样的，删除不一样的，返回boolean
        c.retainAll(c1);
        System.out.println(c);

        //比较两个集合内容是否相等，看集合对象是否有顺序要求
        System.out.println(c.equals(c1));

        //返回当前对象的哈希值
        System.out.println(c.hashCode());

        //集合 --> 数组
        Object[] arr = c1.toArray();
        System.out.println(arr[0]);

        //数组 --> 集合
        List c2 = Arrays.asList(new String[]{"aa","bb","cc"});
        System.out.println(c2);

        //因为int是基本数据类型，所以把数组当成元素来看
        List c3 = Arrays.asList(new Integer[]{123,456});
        System.out.println(c3);
        System.out.println("************************************");

        //返回iterator接口的实例，用于遍历集合元素
        Iterator i = c3.iterator();

        //判断是否还有下一个元素
        while(i.hasNext()){
            //1指针下移，2将当前指针的元素返回
            System.out.println(i.next());
        }
        //集合元素的类型 局部变量 : 集合
        for(Object obj : c3){
            System.out.println(obj);
        }





    }
}
