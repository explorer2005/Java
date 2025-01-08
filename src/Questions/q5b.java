package Questions;
import java.util.Random;
class ATM extends Thread{
    double balance;

    ATM(double balance){
        this.balance=balance;
    }
    synchronized void withdraw(double amount){
        if(amount<=balance){
            System.out.println(Thread.currentThread().getName()+" is withdrawing money");
            balance-=amount;
        }
        else{
            System.out.println(Thread.currentThread().getName()+" is trying to deduct the extra money");
        }
    }
    synchronized void deposit(double amount){
        System.out.println(Thread.currentThread().getName()+" is depositing the money");
    }
    synchronized double getBalance(){
        return balance;
    }
}
class Customer extends ATM{
    ATM atm;
    Customer(double balance,ATM atm){
        super(balance);
        this.atm=atm;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is doing the tasks");
        atm.deposit(5600);
        atm.withdraw(560);
        atm.getBalance();
    }
}
public class q5b {
    public static void main(String[] args) {
        Customer c1 = new Customer(230,new ATM(230));
        Customer c2 = new Customer(430,new ATM(430));

        c1.start();
        c2.start();
        try{
            while(c1.isAlive() || c2.isAlive()){
                System.out.println("Operation going on: ");
                Thread.sleep(new Random().nextInt(1000));
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Done!!!!!!!1");
    }
}
