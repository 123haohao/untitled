package com.atguigu.generic;

import java.util.*;

public class Test {
    @org.junit.Test
    public void ptest(){
        Map<String,Integer> map = new HashMap();
        map.put("Tom",123);
        map.put("Pot",456);
        map.put("dfs",452);


        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "***" + value);

        }
        Test test = new Test();
        Map map1 = test.show(map);
        System.out.println(map1);

        List<String> list = new ArrayList<>();
        list.add("add");

        List<?> list1 = null;
        list1 = list;
        list1.add(null);
        list1.get(0);

        System.out.println(list1);



    }
    public static <E> E show(E e){
        return e;
    }
}
