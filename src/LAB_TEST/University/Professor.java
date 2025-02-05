package LAB_TEST.University;
import java.util.*;
public class Professor extends Employee{
    String department;
    String researchArea;
    Professor(){
        super();
        this.department="NONE";
        this.researchArea="NONE";
    }
    public void getDetails(){
        super.getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Department: ");
        department=sc.next();
        System.out.println("Enter Research Area: ");
        researchArea=sc.next();
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Department: "+department);
        System.out.println("Research Area: "+researchArea);
    }
}
