package com.company;
import java.util.Scanner;
public class pattern_recursion {
    public static void pattern(int n){
        int j=n;
        if(n>0){
            pattern(n-1);
            j=j-1;
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        System.out.println("Enter the number of rows to be included ");
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        pattern(n);
    }
}
