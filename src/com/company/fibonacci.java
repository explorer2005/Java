package com.company;
import java.util.Scanner;
public class fibonacci {
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return(fibonacci(n-1)+fibonacci(n-2));
        }
    }
    public static void main(String [] args){
        System.out.println("Enter the place of which the fibonacci is required");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The ans is: "+fibonacci(n));
    }
}
