package banking;
import java.util.*;
public class SavingAccount extends BankAccount{
    double interestRate;
    SavingAccount(String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber,accountHolder,balance);
        this.interestRate=interestRate;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Insufficient Funds");
        }
        else{
            balance-=amount;
        }
    }
    public double calculateInterest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time period");
        int t=sc.nextInt();
        double Interest=balance*interestRate*t;
        return Interest;
    }

}
