package LAB_TEST.banking;

public abstract class BankAccount implements Account{
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber,String accountHolder,double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public double checkBalance(){
        return balance;
    }
}
