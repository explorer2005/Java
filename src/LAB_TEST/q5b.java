package LAB_TEST;
class ATM{
    double balance;
    ATM(double balance){
        this.balance=balance;
    }
    synchronized void withdraw(double amount){
        if(amount>balance){
            System.out.println(Thread.currentThread().getName()+" is trying to withdraw more money than available");
        }
        else{
            System.out.println(Thread.currentThread().getName()+" is withdrawing "+amount);
        }
        balance-=amount;
    }
    synchronized void deposit(double amount){
        System.out.println(Thread.currentThread().getName()+" is depositing "+amount);
        balance+=amount;
    }
    synchronized double getBalance(){
        System.out.println(Thread.currentThread().getName()+" is getting the balance info");
        return balance;
    }
}
class Customer extends Thread{
    ATM atm;
    Customer(ATM atm){
        this.atm=atm;
    }
    public void run(){
        atm.withdraw(5600);
        atm.deposit(952);
        System.out.println(atm.getBalance());
    }
}
public class q5b {
    public static void main(String[] args){
        ATM a1 = new ATM(963);
        ATM a2 = new ATM(963852);
        Customer c1 = new Customer(a1);
        Customer c2 = new Customer(a2);
        Thread t1 = new Thread(c1,"CUSTOMER 1");
        Thread t2 = new Thread(c2,"CUSTOMER 2");
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
