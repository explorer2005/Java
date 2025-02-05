package LAB_TEST.banking;

public class CurrentAccount extends BankAccount{
    double overdraftLimit;
    public CurrentAccount(String accountNumber, String accountHolder,double balance,double overdraftLimit){
        super(accountNumber,accountHolder,balance);
        this.overdraftLimit=overdraftLimit;
    }
    public void withdraw(double amount) throws OverdraftLimitExceededException, NumberFormatException{
        if(amount<0){
            throw new NumberFormatException("Entered a negative amount");
        }
        if(amount>overdraftLimit){
            throw new OverdraftLimitExceededException("Over limit");
        }
    }
}
