package com.company;
import java.util.*;
public class nestedtrycatch {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0]=10;
        arr[1]=9;
        arr[2]=8;

//        try{
//            System.out.println("Enter the index as num");
//            Scanner sc = new Scanner (System.in);
//            int n= sc.nextInt();
//            try{
//                System.out.println("Enter the denominator: ");
//                int d = sc.nextInt();
//                int c = arr[n]/d;
//                System.out.println("The answer is: "+c);
//            }catch(ArithmeticException e){
//                System.out.println("The error is: "+e);
//            }
//        }catch(IndexOutOfBoundsException e){
//            System.out.println("The error is: "+e);
//        }
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            try {
                System.out.println("Enter the index of the numberator: ");
                int n = sc.nextInt();
                System.out.println(arr[n]);
                flag = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The error is: " + e);
            }
        }
    }
}
