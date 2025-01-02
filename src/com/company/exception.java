package com.company;
class MyException extends Exception{
    public String getMessage(){
        return "I am getMessage()";
    }

    public String toString(){
        return "I am toString()";
    }
}
public class exception {
    public static void main(String[] args) {
        MyException dd = new MyException();
        try{
            throw dd;
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
