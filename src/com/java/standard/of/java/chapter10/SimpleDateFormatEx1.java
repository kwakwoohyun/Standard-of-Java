package com.java.standard.of.java.chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

    public static void main(String[] args) throws ParseException {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String result = df.format(today);
        System.out.println(result);

        DateFormat df1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        Date d = df1.parse("2015년 7월 10일");
        String result1 = df2.format(d);
        System.out.println(result1);
    }

}
