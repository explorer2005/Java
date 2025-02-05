package LAB_TEST.University;
import java.util.Scanner;
public class Employee implements Person{
    String name;
    int age;
    String designation;
    double salary;
    Employee(){
        this.name="NONE";
        this.designation="NONE";
        this.age=0;
        this.salary=0d;
    }
    public void getDetails(){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter name: ");
        name=sc.next();
        System.out.println("Enter age: ");
        age=sc.nextInt();
        System.out.println("Enter Designation: ");
        designation=sc.next();
        System.out.println("Enter Salary: ");
        salary=sc.nextDouble();
    }
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+salary);
    }
}
