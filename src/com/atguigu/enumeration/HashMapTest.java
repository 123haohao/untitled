package com.atguigu.enumeration;

import java.util.*;


public class HashMapTest{
    public static void main(String[] args) {
        HashMap map = new HashMap();
        LinkedHashMap hashMap = new LinkedHashMap();
        map.put(123,456);
        map.put(1,789);
        map.put(32,213);
        map.put(35,12);
        map.put(213,453);


        List list = new ArrayList();
        list.add(map);
        for (Object obj : list){
            System.out.println(obj);
        }

        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            Object value = map.get(next);
            System.out.println(next + "***" + value);
        }

        System.out.println();

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Object next = it.next();
            Map.Entry entry = (Map.Entry) next;
            System.out.println(entry.getKey() + "+++" + entry.getValue());
        }



    }
}
