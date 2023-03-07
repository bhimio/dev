package com.bhima;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class App {
    public App(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ld = LocalDate.parse("02/07/2010", formatter);
        String formatted = ld.format(formatter);
        Date legacyDate = new Date();
        ZonedDateTime zdt = ZonedDateTime.ofInstant(
                legacyDate.toInstant(), ZoneId.systemDefault());
        ld = zdt.toLocalDate();
        formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);
        InnerApp_1 iApp_1 = new InnerApp_1(args);
    }
}

class InnerApp {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("42.35");
        BigDecimal b;
        b = a.setScale(1, RoundingMode.HALF_UP);
        System.out.println(b.toString());
        b = a.setScale(1, RoundingMode.HALF_DOWN);
        System.out.println(b.toString()); // 42.3
        BigDecimal op1 = new BigDecimal("10");
        BigDecimal op2 = new BigDecimal("4");
        BigDecimal c = op1.divide(op2); // ERROR
        System.out.println(c);
        c = op1.divide(op2, RoundingMode.HALF_UP); // 2
        System.out.println(c.toString());

        c = op1.divide(op2, 2, RoundingMode.HALF_UP); // 1.67
        System.out.println(c.toString());

        c = op1.divide(op2, 2, RoundingMode.DOWN); // 1.66
        System.out.println(c.toString());
        App app = new App(args);

    }
}

class InnerApp_1 {
    public InnerApp_1(String[] args) {

    }
}
