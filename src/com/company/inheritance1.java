package com.company;
class A{
    int x;
    int y;
    A(){
        x=5;
        y=5;
        System.out.println("The parent constructor is initialised");
    }
    public void print(){
        System.out.println("Parent");
    }
    public void printparent(){
        System.out.println("Only in the parent");
    }
}
class B extends A{
    int z;
    B(){
        z=5;
        System.out.println("Child constructor is initialised");

    }
//    public void print(){
//        System.out.println("Child");
//    }
//    public void printchild(){
//        System.out.println("Only in child");
//    }
}
public class inheritance1 {
    public static void main(String[] args) {
        A first = new A();
        B second = new B();
//        first.print();
//        second.print();
//        second.printchild();
//        second.printparent();


    }
}
