package com.company;

public class string {
    public static void main(String[] args){
        String s=new String("  Dhruv  ");
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.substring(2));
        System.out.println(s.substring(2,5));
        System.out.println(s.replace('h','n'));
    }
}
