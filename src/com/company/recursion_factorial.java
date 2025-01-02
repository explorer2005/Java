package com.company;
import java.util.Scanner;
public class recursion_factorial {
    static int factorial(int k){
        if(k==0||k==1){
            return k;
        }
        else{
            return (k*factorial(k-1));
        }
    }
    public static void main(String[] args){
        Scanner sc ;
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("The answer of the problem is: "+ans);
    }
}
