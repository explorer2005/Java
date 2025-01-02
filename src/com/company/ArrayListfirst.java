package com.company;
import java.util.*;

public class ArrayListfirst {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        first.add(69);
        first.add(79);
        first.add(89);
        first.add(99);
        first.add(109);
        first.add(0,19);
        first.addAll(0,l2);
        for(int i=0;i<first.size();i++){
            System.out.println(first.get(i));
        }

    }
}
