package LAB_TEST.University;
import java.util.*;
public class AdminStaff extends Employee{
    String role;
    int workingHours;

    AdminStaff(){
        super();
        this.role="NONE";
        this.workingHours=0;
    }
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        super.getDetails();
        System.out.println("Enter Role: ");
        role=sc.next();
        System.out.println("Enter Working Hours: ");
        workingHours=sc.nextInt();
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Role: "+role);
        System.out.println("Working Hours: "+workingHours);
    }
}
