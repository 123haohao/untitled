package com.atguigu.commonclass;

import org.junit.Test;

public class maxString {
    //找出最大相同子串
    public String getMaxString(String str,String str1){
        String maxstr = (str.length() >= str1.length()) ? str : str1;
        String minstr = (str.length() < str1.length()) ? str : str1;
        int minlen = minstr.length();
        for (int i = 0;i < minlen;i++){
            for (int x = 0,y = minlen - i;y <= minlen;x++,y++) {
                //123456
                //12345,23456
                //1234,2345,3456
                //123,234,345,456
                //12,23,34,45,56
                //1,2,3,4,5,6
                String temp = minstr.substring(x,y);
                if (maxstr.contains(temp)) {
                    return temp;
                }
            }
        }
        return null;
    }



    @Test
    public void test(){
        String s = "sdoiuwehdfdjjj213hfdjh";
        String s1 = "fdjhjj";
        System.out.println(getMaxString(s,s1));
    }
}
