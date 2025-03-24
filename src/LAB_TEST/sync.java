package LAB_TEST;
class counter{
    int count=0;
    synchronized void increment(){
        System.out.println(Thread.currentThread().getName()+"Increase the counter"+(++count));
    }
    void ans(){
        System.out.println("ans is: "+count);
    }
}
class MyCounter extends Thread{
    counter Counter;
    MyCounter(counter Counter){
        this.Counter=Counter;
    }
    public void run(){
        for(int i=5;i>=0;i--){
            Counter.increment();
            try{
                Thread.sleep(10000);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
public class sync {
    public static void main(String [] args){
        counter c = new counter();
        MyCounter t1 = new MyCounter(c);
        MyCounter t2 = new MyCounter(c);
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
