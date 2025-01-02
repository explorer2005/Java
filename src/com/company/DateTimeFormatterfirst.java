package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterfirst {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dn =  dt.format(df);
        System.out.println(dn);
    }
}
