package university;
import java.util.*;
public class AdminStaff extends Employee{
        String role;
        int workingHours;
        public void getDetails(){
            super.getDetails();
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the role: ");
            role = sc.next();
            System.out.println("Enter the Working Hours: ");
            workingHours = sc.nextInt();
        }
        public void printDetails(){
            super.printDetails();
            System.out.println("Role: "+role);
            System.out.println("Working Hours: "+workingHours);
        }
}
