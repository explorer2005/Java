package Questions;
import java.util.Random;
abstract class Task  extends Thread{
    int priority;
    Task(int priority){
        this.priority=priority;
        setPriority(priority);
    }
    abstract void execute();
    public void run() {
        execute();
    }
}
class HighPriorityTask extends Task{

    HighPriorityTask(){
        super(Thread.MAX_PRIORITY);
    }
    public void execute(){
        System.out.println(Thread.currentThread().getName()+"High Priority task is going on");
        for(int i=1;i<5;i++){
            System.out.println("High Priority Task: "+i);
            try{
                Thread.sleep(new Random().nextInt(5000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class LowPriorityTask extends Task{
    LowPriorityTask(){
        super(Thread.MIN_PRIORITY);
    }
    public void execute(){
        System.out.println(Thread.currentThread().getName()+"Low priority task is going on");
        for(int i=1;i<5;i++){
            System.out.println("Low Priority Task"+i);
            try{
                Thread.sleep(new Random().nextInt(5000));
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class q1b {
    public static void main(String[] args) {
        HighPriorityTask h = new HighPriorityTask();
        LowPriorityTask l = new LowPriorityTask();

        h.start();
        l.start();

        try{
            while(h.isAlive() || l.isAlive()){
                System.out.println("Task is going on....");
                Thread.sleep(1000);
            }
            h.join();
            l.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Done!!!!!!!1");
    }
}
