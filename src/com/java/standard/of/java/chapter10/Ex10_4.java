package com.java.standard.of.java.chapter10;

import java.util.Calendar;

public class Ex10_4 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,7,31); // 2019년 8월 31일 셋팅

        System.out.println(toString(calendar));
        System.out.println("= 1일 후 =");
        calendar.add(Calendar.DATE, 1);
        System.out.println(toString(calendar));

        System.out.println("= 6개월 전 =");
        calendar.add(Calendar.MONTH, -6);
        System.out.println(toString(calendar));

        System.out.println("= 31일 후(roll) =");
        calendar.roll(Calendar.DATE, 31);
        System.out.println(toString(calendar));

        System.out.println("= 31일 후(add) =");
        calendar.add(Calendar.DATE, 31);
        System.out.println(toString(calendar));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }

}
