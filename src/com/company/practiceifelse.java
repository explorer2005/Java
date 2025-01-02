package com.company;
import java.util.Scanner;
public class practiceifelse {
    public static void main(String [] arg){
//        System.out.println("All the subjects are out of 100");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter all the 3 subject marks");
//        int f=sc.nextInt();
//        int s=sc.nextInt();
//        int t=sc.nextInt();
//        if(f >= 33 && s>=33 && t>=33 && ((f+s+t)/3)>=40){
//            System.out.println("The student is passed");
//        }
//        else{
//            System.out.println("The student is failed.");
//        }
        System.out.println("Enter the website url");
        Scanner sc=new Scanner(System.in);
        String link = sc.nextLine();
        switch(link.substring('.')){
            case "com":
                System.out.println("commercial website");
                break;
            case "org":
                System.out.println("Organisational website");
                break;
            case "in":
                System.out.println("Indian Website");
                break;
            default:
                System.out.println("Enter the valid input");
                break;
        }


    }
}
