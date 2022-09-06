package com.atguigu.enumeration;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(50);
        list.add(123);
        list.add(new String("aa"));
        list.add(456);

        list.remove("aa");
        list.set(0,234);

        LinkedList list1 = new LinkedList();
        //迭代器循环
        Iterator l = list.iterator();
        while(l.hasNext()){
            System.out.println(l.next());
        }
        //for增强循环
        for (Object obj : list){
            System.out.println(obj);
        }
        //for普通遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
