package com.atguigu.commonclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fish {
    public static void main(String[] args) throws ParseException {
        //开始打鱼日期
        String initialDay = "2022-04-27";
        //需要文本转日期方法，先创建对象
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        //拿到初始日期的毫秒数
        long initDay = format.parse(initialDay).getTime();

        //拿到当前时间的毫秒数
        long nowDay = new Date().getTime();

        //拿到时间搓
        long timeRubbing= nowDay - initDay;

        //把时间搓转换为天数,得加1天数
        long day = timeRubbing / (1000 * 60 * 60  *24) + 1;

        //打鱼是5的周期，取余5，123打鱼，4，0摸鱼
        String str =  String.valueOf(day % 5);
        String str1 = "123";
        System.out.println(str);
        if (str1.contains(str)){
            System.out.println("在打鱼");
        }else System.out.println("在摸鱼");
    }
}
