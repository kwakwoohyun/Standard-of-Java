package com.java.standard.of.java.chapter10;

import java.util.Calendar;
import java.util.Date;

public class CalendarEx4 {

    public static void main(String[] args) {
        Calendar dt = Calendar.getInstance();
        System.out.println(new Date(dt.getTimeInMillis()));
        dt.clear(); // 1970년 1월 1일로 초기화
        System.out.println(new Date(dt.getTimeInMillis()));

//        특정 필드 초기화 방법
        Calendar dt2 = Calendar.getInstance();
        System.out.println(new Date(dt2.getTimeInMillis()));
        dt2.clear(Calendar.SECOND);
        System.out.println(new Date(dt2.getTimeInMillis()));
        dt2.clear(Calendar.MINUTE);
        System.out.println(new Date(dt2.getTimeInMillis()));
        dt2.clear(Calendar.HOUR_OF_DAY);
        System.out.println(new Date(dt2.getTimeInMillis()));
        dt2.clear(Calendar.HOUR);
        System.out.println(new Date(dt2.getTimeInMillis()));
    }

}
