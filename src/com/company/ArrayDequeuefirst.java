package com.company;
import java.util.*;
public class ArrayDequeuefirst {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(10);
        d1.add(20);
        d1.add(30);
        d1.add(40);
        d1.add(50);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
        d1.remove();
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
    }
}
