package com.atguigu.commonclass;

import org.junit.Test;

public class Reverse {

    public String reverse(String str,int start,int end){
        if (str != null && str.length() != 0) {
            char[] a = str.toCharArray();
            for (int i = start, y = end; i < y; i++, y--) {
                char tem = a[i];
                a[i] = a[y];
                a[y] = tem;
            }
            return new String(a);
        }
        return null;
    }



    public String reversee(String str,int start,int end){
        //拿到要反转的子串
        String s = str.substring(start,end + 1);
        //转化为Builder
        StringBuilder sb1 = new StringBuilder(s);
        //调用Builder的reverse()方法
        sb1.reverse();
        //修改父串,方法参数是CharSequence，三个类都实现了CharSequence接口，可以直接放
        return str.replace(s,sb1);

    }

    @Test
    public void Test(){
        String str = "12345678";
        System.out.println(reverse(str,2,6));
        System.out.println(reversee(str,2,6));
    }
}
