package university;
import java.util.*;
public class Employee implements Person{
    String name;
    int age;
    String designation;
    double salary;
    Scanner sc = new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter the name: ");
        name=sc.next();
        System.out.println("Enter the age: ");
        age=sc.nextInt();
        System.out.println("Enter the designation: ");
        designation=sc.next();
        System.out.println("Enter the salary: ");
        salary=sc.nextDouble();
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Designation: "+designation);
    }
}
