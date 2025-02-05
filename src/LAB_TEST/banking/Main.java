package LAB_TEST.banking;

public class Main {
    public static void main(String [] args){
        SavingsAccount ba1 = new SavingsAccount("06892122000555","DHRUV",963258741,5);
        CurrentAccount ba2 = new CurrentAccount("06892155896325","GUPTA",963741,7896);
        ba1.deposit(1000);
        ba2.deposit(1200);
        System.out.println(ba1.checkBalance());
        System.out.println(ba2.checkBalance());
        try{
            ba1.withdraw(-100);
            ba1.withdraw(9630);
            ba1.withdraw(741852963);
            ba2.withdraw(-96300);
            ba2.withdraw(1223);
            ba2.withdraw(1235678740);
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }catch(OverdraftLimitExceededException e1){
            System.out.println(e1.getMessage());
        }catch(NumberFormatException e2){
            System.out.println(e2.getMessage());
        }
        System.out.println(ba1.checkBalance());
        System.out.println(ba2.checkBalance());
    }
}
