package com.company;
class myThrea extends Thread{
    public myThrea(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am running "+getName());
    }
}
public class threadpriorities {
    public static void main(String[] args) {
        myThrea t1=new myThrea("Dhruv");
        myThrea t2=new myThrea("Riya");
        myThrea t3=new myThrea("Yash");
        myThrea t4=new myThrea("Nima");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t1.start();t2.start();t3.start();t4.start();
    }
}
