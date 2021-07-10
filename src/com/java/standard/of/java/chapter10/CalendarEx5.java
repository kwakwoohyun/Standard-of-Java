package com.java.standard.of.java.chapter10;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx5 {

    public static void main(String[] args) {

//        add()는 특정 필드의 값을 증가 또는 감소(다른 필드에 영향을 준다.)
        Calendar date = Calendar.getInstance();
        date.clear();
        date.set(2020, 7, 31);
        System.out.println(new Date(date.getTimeInMillis()));

        date.add(Calendar.DATE, 1);
        date.add(Calendar.MONTH, -8);
        System.out.println(new Date(date.getTimeInMillis()));

//        roll()은 특정 필드의 값을 증가 또는 감소(다른 필드에 영향을 주지 않는다.)
        date.clear();
        date.set(2020, 7, 31);
        System.out.println(new Date(date.getTimeInMillis()));

        date.roll(Calendar.DATE, 1);
        System.out.println(new Date(date.getTimeInMillis()));
        date.roll(Calendar.MONTH, -8);
        System.out.println(new Date(date.getTimeInMillis()));

    }

}
