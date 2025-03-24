package LAB_TEST;
class A extends Thread{
    A(String name){
        super(name);
    }
    public void run(){
        System.out.println(getName()+" is running with priority "+getPriority());
    }
}
public class prio {
    public static void main(String [] args){
        A a1 = new A("first");
        A a2 = new A("second");
        A a3 = new A("Third");

        a1.setPriority(Thread.MAX_PRIORITY);
        a2.setPriority(Thread.MIN_PRIORITY);
        a3.setPriority(Thread.NORM_PRIORITY);

        a1.start();
        a2.start();
        a3.start();
    }
}
