package LAB_TEST.banking;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount)throws InsufficientFundsException,OverdraftLimitExceededException,NumberFormatException;
    double checkBalance();
}
