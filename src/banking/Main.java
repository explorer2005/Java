package banking;
import java.util.*;
public class Main {
    public static void main(String [] args){
        try{
            SavingAccount s1 = new SavingAccount("068921","DHRUV",5600000,15);
            SavingAccount s2 = new SavingAccount("06892123","RIYA",589632,10);
            SavingAccount s3 = new SavingAccount("06892023","ESHA",589632,10);
            CurrentAccount c1 = new CurrentAccount("06892325","ANKUSH",7413,12);
            s1.withdraw(2589);
            double ans = s1.checkBalance();
            double cal = s1.calculateInterest();
            System.out.println("The interest rate is: "+cal);
            System.out.println("The balance is: "+ans);
           // s3.withdraw(-950);
           // s2.withdraw(147852369);
            c1.withdraw(785236998);
        }catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }catch(InsufficientFundsException | OverDraftLimitExceedsException e){
            System.out.println(e.getMessage());
        }
    }
}
