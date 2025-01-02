package com.company;
import java.util.*;
public class calendergregory {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
//        System.out.println(c.get(Calendar.DATE));
//        System.out.println(c.get(Calendar.SECOND));
//        System.out.println(c.get(Calendar.HOUR));
//        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        int i=0;
        while(i<100){
            System.out.println(c.get(Calendar.SECOND));
                i++;
        }
    }
}
