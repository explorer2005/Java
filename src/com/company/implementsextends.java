package com.company;
class Z{
    Z(){
        System.out.println("I am the parent class");
    }
}
interface one{
    void innn();
}
class subz extends Z implements one{
    public void innn(){
        System.out.println("I am the interface ");
    }
}
public class implementsextends {
    public static void main(String[] args) {
        subz on = new subz();
        on.innn();
    }
}
