package com.company;
import java.util.*;
public class specifiedtrycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;
        System.out.println("Enter the index of the dividend");
        int n=sc.nextInt();
        System.out.println("Enter the denominator");
        int d=sc.nextInt();
        try{
            int c=arr[n]/d;
            System.out.println("The ans is: "+c);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured: "+e);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Out of bound Exception occured: "+e);
        }catch(Exception e){
            System.out.println("Other Exception occured: "+e);
        }
    }
}
