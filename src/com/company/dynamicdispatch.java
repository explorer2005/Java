package com.company;
class A3{
    A3(){
        System.out.println("Parent class invoked");
    }
    public void meth1(){
        System.out.println("Parent meth1 invoked");
    }
    public void meth2(){
        System.out.println("Parent meth2 invoked");
    }
}
class B3 extends A3{
    B3(){
        System.out.println("Child class Invoked");
    }
    public void meth2(){
        System.out.println("Child meth2 invoked");
    }
    public void meth3(){
        System.out.println("child meth3 invoked");
    }
}
public class dynamicdispatch {
    public static void main(String[] args) {
        A3 first = new B3();
        first.meth1();
        first.meth2();
        //first.meth3();
    }
}
