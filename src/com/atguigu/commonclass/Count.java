package com.atguigu.commonclass;

import org.junit.Test;

public class Count {
    public int getCount(String main,String mini){
        int maxLen = main.length();
        int minLen = mini.length();
        int count = 0;
        int index = 0;

        if (maxLen >= minLen){
            while((index = main.indexOf(mini,index)) != -1){
                count++;
                index += minLen;
            }
        }else return 0;
        return count;
    }



    @Test
    public void p(){
        String s = "sdsdjfiwe";
        String p = "sd";
        System.out.println(getCount(s,p));
    }
}


