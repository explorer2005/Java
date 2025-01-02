package com.company;
import java.util.*;
public class dateandtime {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date latest = new Date();
        System.out.println(latest.getDate());
        System.out.println(latest);
        System.out.println(latest.getTime());
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

    }
}
