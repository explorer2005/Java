package com.company;
class myThreadrunnable1 implements Runnable{
    public void run(){
        System.out.println("I am runnable 1");
    }
}
class myThreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("I am runnable 2");
    }
}
public class threadimplementsrjunnable {
    public static void main(String[] args) {
        myThreadrunnable1 t1 = new myThreadrunnable1();
        Thread t11 = new Thread(t1);
        myThreadrunnable2 t2 = new myThreadrunnable2();
        Thread t22 = new Thread(t2);
        t11.start();
        t22.start();
    }
}
