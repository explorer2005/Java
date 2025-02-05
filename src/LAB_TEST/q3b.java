package LAB_TEST;
abstract class Task extends Thread{
    int priority;
    Task(int priority){
        this.priority=priority;
        setPriority(priority);
    }
    public void execute(){};
    public void run(){
        execute();
    }
}
class HighPriorityTask extends Task {
    HighPriorityTask(){
        super(MAX_PRIORITY);
    }
    public void execute(){
        System.out.println("High priority task is going on: "+getPriority());
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
//    public int getPriority(){
//        return priority;
//    }
}
class LowPriorityTask extends Task{
    LowPriorityTask(){
        super(MIN_PRIORITY);
    }
    public void execute(){
        System.out.println("Low priority task is going on:"+getPriority());
        try{
            for(int i=10;i<15;i++){
                Thread.sleep(10000);
                System.out.println(i);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class q3b {
    public static void main(String [] args){
        HighPriorityTask t1 = new HighPriorityTask();
        LowPriorityTask t2 = new LowPriorityTask();
        t1.start();
        t2.start();
        while(t1.isAlive()||t2.isAlive()){
            try{
                t1.join();
                t2.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
