package com.atguigu.commonclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test {
    public static void  main(String[] args){
        GregorianCalendar calendar = new GregorianCalendar();
        Calendar calendar1 = Calendar.getInstance();

        System.out.println(calendar1.get(7));
        int d = calendar.get(calendar.DATE);
        System.out.println(d);


        calendar.set(Calendar.DATE,21);
        System.out.println(calendar.get(5));

        calendar.add(calendar.DATE,-3);
        System.out.println(calendar.get(5));


        Date date = new Date();
        calendar.setTime(date);
        System.out.println(calendar.get(5));
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();


        LocalDateTime localDateTime1 = LocalDateTime.of(2022,
                9, 1, 13,58,23);

        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.getMonth());
        System.out.println(localDateTime1.getDayOfMonth());

        LocalDateTime localDateTime2 = localDateTime1.withYear(2000);
        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime2.getYear());

        LocalDateTime localDateTime3 = localDateTime2.plusYears(23);
        System.out.println(localDateTime3.getYear());

        LocalDateTime localDateTime4 = localDateTime3.minusYears(1);
        System.out.println(localDateTime4.getYear());

    }
}
