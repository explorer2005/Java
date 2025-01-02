package com.company;
class myThreads1 extends Thread{
    public void run(){
        while(true) {
            System.out.println("I am thread 1");
            System.out.println("I am running");
        }
    }
}
class myThreads2 extends Thread{
    public void run(){
        while(true) {
            System.out.println("I am thread 2");
            System.out.println("I am closing");
        }
    }
}
class myThreads3 extends Thread{

}
public class threadwithextends {
    public static void main(String[] args) {
        myThreads1 t1 = new myThreads1();
        myThreads2 t2 = new myThreads2();
        myThreads3 t3 = new myThreads3();
        t1.start();
        t2.start();
        t3.start();
    }
}
