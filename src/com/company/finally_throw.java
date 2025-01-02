package com.company;

public class finally_throw {
    public static void greet(){
        try{
            int a=9;
            int b=0;
            int c=(a/b);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("I entered finally block");
        }
    }
    public static void main(String[] args) {
        greet();
    }
}
