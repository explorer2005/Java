package com.company;
class A1{
    int k=5;
    int r=10;
    A1(){
        System.out.println("Parent class ");
    }
    A1(int x){
        System.out.println("overloaded constructor of parent class: "+k);
    }
}
class A2 extends A1{
    A2(){
        System.out.println("Child class");
    }
    A2(int r){
        System.out.println("Overloaded constructor of the child: "+k+r);
    }
}
public class inheritance2 {
    public static void main(String[] args) {
        A1 first = new A1(52);
        A2 second = new A2(6);

    }
}
