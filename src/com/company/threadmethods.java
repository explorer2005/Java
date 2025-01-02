package com.company;
class myThread1 extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
        System.out.println("Thread 1");
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Thread 2");
        }
    }
}
public class threadmethods {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            t1.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
