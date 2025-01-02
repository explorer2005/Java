package com.company;
class myThr extends Thread{
    public myThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am thread 1");
    }
}
public class constructorinthreads {
    public static void main(String[] args) {
        myThr t1 = new myThr("Dhruv");
        myThr t2 = new myThr("Riya");
        System.out.println(t1.getId()+
        t1.getName()+
        t2.getId()+
        t2.getName());
    }
}
