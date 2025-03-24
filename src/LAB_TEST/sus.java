package LAB_TEST;
class MyRunnable implements Runnable{
    String name;
    MyRunnable(String name){
        this.name=name;
    }
    public void run(){
        System.out.println("Formed using runnable interface");
    }
}
public class sus {
    public static void main(String [] args){
        MyRunnable r1 = new MyRunnable("FIRST");
        MyRunnable r2 = new MyRunnable("SECOND");
        Thread t1 = new Thread(r1,"first");
        Thread t2 = new Thread(r2,"second");
        t1.start();
        t2.start();
    }
}
