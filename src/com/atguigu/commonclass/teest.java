package com.atguigu.commonclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class teest {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();

        String str = dateTimeFormatter.format(now);
        String str1 = dateTimeFormatter1.format(now1);
        String str2 = dateTimeFormatter2.format(now2);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);

        TemporalAccessor parse = dateTimeFormatter.parse("2022-05-01");
        TemporalAccessor parse1 = dateTimeFormatter1.parse("23:19:35.401");
        TemporalAccessor parse2 = dateTimeFormatter2.parse("2022-05-01T23:19:35.401");

        String str3 = dateTimeFormatter3.format(now2);
        System.out.println(str3);
        TemporalAccessor parse3 = dateTimeFormatter3.parse("2022-05-01 23:46:01");

    }
}
