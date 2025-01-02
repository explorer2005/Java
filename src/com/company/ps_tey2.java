package com.company;
import java.util.*;
public class ps_tey2 {
    public static void main(String[] args) {
        System.out.println("Enter the elements of the array");
        int [] arr = new int[5];
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        while(i<5){
            try{
                System.out.println("Enter the index:");
                int k=sc.nextInt();
                System.out.println("ans is: "+arr[k]);
                break;
            }catch(Exception e){
                System.out.println("Invalid");
                i++;
            }
        }
    }
}
