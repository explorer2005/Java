package LAB_TEST;
class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Running the thread: "+getName());
        for(int i=0;i<5;i++){
            System.out.println("Number is: "+i);
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                e.getMessage();
            }
        }
    }
}
public class Multiple {
    public static void main(String [] args){
        MyThread t1 = new MyThread("first");
        MyThread t2 = new MyThread("second");
        MyThread t3 = new MyThread("third");

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.suspend();
            t2.resume();

            t2.join();
            t3.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
