package banking;

public class CurrentAccount extends BankAccount{
    double overdraftLimit;
    CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit){
        super(accountNumber, accountHolder,balance);
        this.overdraftLimit=overdraftLimit;
    }
    public void withdraw(double amount) throws OverDraftLimitExceedsException{
        if(amount>balance){
            throw new OverDraftLimitExceedsException("Limit exceeded");
        }
        else{
            balance-=amount;
        }
    }
}
