package banking;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException,OverDraftLimitExceedsException;
    double checkBalance();
}

