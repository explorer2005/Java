package banking;

public class BankAccount implements Account{
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public void deposit(double amount) throws NumberFormatException{
        if(amount<0){
            throw new NumberFormatException();
        }
        else{
            balance+=amount;
        }
    }
    public void withdraw(double amount) throws InsufficientFundsException,OverDraftLimitExceedsException {
        balance-=amount;
    }
    public double checkBalance(){
        return balance;
    }
}
