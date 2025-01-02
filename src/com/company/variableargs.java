package com.company;

public class variableargs {
    static int sum(int...arr){
        int ans=0;
//        for(int i=0;i<arr.length;i++){
//            ans+=arr[i];
//        }
        for(int element:arr){
            ans+=element;
        }
        return ans;
    }
    public static void main(String [] args){
        System.out.println("The sum of 2 and 3 is:"+sum(2,3));
        System.out.println("The sum of 2,4 and 3 is:"+sum(2,4,3));
        System.out.println("The sum of 2,4,6 and 3 is:"+sum(2,4,6,3));
        System.out.println("The sum of 2,4,6,8 and 3 is:"+sum(2,4,6,8,3));
    }
}
