package LAB_TEST.banking;
import java.util.Scanner;
public class SavingsAccount extends BankAccount{
    double interestRate;

    public SavingsAccount(String accountNumber,String accountHolder,double balance, double interestRate){
        super(accountNumber,accountHolder,balance);
        this.interestRate=interestRate;
    }
    public double calculateInterest(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the time period in years: ");
        int t=sc.nextInt();
        return (interestRate*balance*t)/100;
    }
    public void withdraw(double amount)throws InsufficientFundsException,NumberFormatException{
        if(amount<0){
            throw new NumberFormatException("Entered negative amount");
        }
        if(balance<amount){
            throw new InsufficientFundsException("Insufficient amount");
        }
    }
}
