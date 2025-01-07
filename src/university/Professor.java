package university;
import java.util.*;
public class Professor extends Employee{
    String department;
    String researchArea;
    public void getDetails(){
        super.getDetails();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the department: ");
        department = sc.next();
        System.out.println("Enter the research Area: ");
        researchArea = sc.next();
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Department: "+department);
        System.out.println("Research Area: "+researchArea);
    }
}
