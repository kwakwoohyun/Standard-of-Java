package com.java.standard.of.java.chapter10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx1 {

    public static void main(String[] args) throws ParseException {

        double number = 1234567.89; // 10진수
        DecimalFormat df = new DecimalFormat("#.#E0"); // 지수형식
        String result = df.format(number); // 1.2 * 10^6
        System.out.println(result);

        DecimalFormat df2 = new DecimalFormat("#,###.##");
        Number num = df2.parse("1,234,567.89");
        double d = num.doubleValue();
        System.out.println(d);


        double number2  = 1234567.89;

        String[] pattern = {
                "0",
                "#",
                "0.0",
                "#.#",
                "0000000000.0000",
                "##########.####",
                "#.#-",
                "-#.#",
                "#,###.##",
                "#,####.##",
                "#E0",
                "0E0",
                "##E0",
                "00E0",
                "####E0",
                "0000E0",
                "#.#E0",
                "0.0E0",
                "0.000000000E0",
                "00.00000000E0",
                "000.0000000E0",
                "#.#########E0",
                "##.########E0",
                "###.#######E0",
                "#,###.##+;#,###.##-",
                "#.#%",
                "#.#\u2030",
                "\u00A4 #,###",
                "'#'#,###",
                "''#,###",
        };

        for(int i=0; i < pattern.length; i++) {
            DecimalFormat df3 = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n",pattern[i], df.format(number2));
        }
    }

}
