package com.company;
import java.util.Scanner;
public class CWH_06_calculator {
    public static void main(String []args){
        System.out.println("Enter subject 1 marks");
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println("Enter subject 2 marks");
        int b=sc.nextInt();
        System.out.println("Enter subject 3 marks");
        int c=sc.nextInt();
        System.out.println("Enter subject 4 marks");
        int d=sc.nextInt();
        System.out.println("Enter subject 5 marks");
        int e=sc.nextInt();
        System.out.println("The percentage of the marks are: "+(a+b+c+d+e)/5);

    }
}
