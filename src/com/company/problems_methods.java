package com.company;
import java.util.Scanner;
public class problems_methods {
    public static int sum(int n){
        if(n==0) {
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String [] args){
        System.out.println("Enter the number upto which the sum is to written ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int ans=sum(a);
        System.out.println("The ans is: "+ans);
    }
}
