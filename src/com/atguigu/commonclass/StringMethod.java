package com.atguigu.commonclass;

import org.junit.Test;

public class StringMethod {
    @Test
    public void testp(){
        String str = new String("hello world");
        String str1 = "HELLO WORLD";
        String str2 = "  application programming interface ";
        //返回此字符串大写
        String s = str.toUpperCase();
        //返回此字符串小写
        String s1 = str1.toLowerCase();

        //返回字符串的长度
        System.out.println(str.length());

        //判断字符串是否为空，返回boolean值
        System.out.println(str.isEmpty());

        System.out.println(str.equals(str1));
        //忽略大小写，比较内容是否相等
        System.out.println(str.equalsIgnoreCase(str1));

        //忽略前导空格和结尾空格
        System.out.println(str2.trim());
        //忽略前导空格，返回一个字符char
        System.out.println(str2.trim().charAt(0));

        //比较的是ascii码值，返回的是int
        System.out.println(str.compareTo(str1));

        //返回一个新字符串，左闭到所有
        System.out.println(str.substring(6));
        ////返回一个新字符串，左闭右开
        System.out.println(str2.substring(26,36));

        //判断是否以指定可变长度的子串开始，返回boolean
        System.out.println(str2.startsWith("  a"));
        //判断是否以指定可变长度的子串结束，返回boolean
        System.out.println(str2.endsWith("face "));
        //以指定长度开始，判断是否以指定可变长度的子串开始，返回boolean
        System.out.println(str2.startsWith("pro",14));

        //判断指定子串在不在父串中，返回boolean
        System.out.println(str.contains("llo"));

        //返回指定字符在此字符串中第一次出现处的索引。没有则为-1
        System.out.println(str.indexOf("llo"));
        //从指定位置开始包括本身，返回指定字符在此字符串中第一次出现处的索引。没有则为-1
        System.out.println(str.indexOf("o",2));
        //返回指定字符在此字符串中最后一次出现处的索引,没有则为1
        System.out.println(str.lastIndexOf("o"));
        //从指定位置开始包括本身反着查找（右往左)，返回指定字符在此字符串中第最后次出现处的索引。没有则为-1
        System.out.println(str.lastIndexOf("l",10));


        String str3 = "南京同仁堂南京";
        //返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        System.out.println(str3.replace("南","北"));
        System.out.println(str3.replace("南京","上海"));
    }
}
