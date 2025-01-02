package com.company;
interface sample{
    void meth1();
    void meth2();
    default void meth3(){
        System.out.println("sample classes");
    }
}
interface childsample extends sample{
    void meth4();
    void meth5();
}
class dhruv implements childsample{
    public void meth1(){
        System.out.println("meth1 called");
    }
    public void meth2(){
        System.out.println("meth2 called");
    }
    public void meth4(){
        System.out.println("meth4 called");
    }
    public void meth5(){
        System.out.println("meth5 called");
    }
}
public class inheritanceininterfaces {
    public static void main(String[] args) {
        dhruv riya = new dhruv();
        riya.meth1();
        riya.meth2();
        riya.meth3();
        riya.meth4();
        riya.meth5();
    }
}
