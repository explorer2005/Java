package com.company;
abstract class parent{
    abstract void greet1();
    abstract void greet2();
}
class child extends parent{
    void greet1(){
        System.out.println("Good morning");
    }
    void greet2(){
        System.out.println("Good night");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        child one=new child();
    }
}
