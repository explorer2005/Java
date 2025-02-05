package LAB_TEST;
import java.util.Scanner;
class Vehicle{
    String make;
    String model;
    int year;

    Vehicle(){
        this.make="NONE";
        this.model="NONE";
        this.year=0;
    }
    Vehicle(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
    void displayDetails(Boolean detailed){
        displayDetails();
        System.out.println("Additional Info is provided.");
    }
    static void showType(){
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle{
    int numberOfDoors;
    Car(){
        super();
        this.numberOfDoors=0;
    }
    Car(String make,String model,int year,int numberOfDoors){
        super(make,model,year);
        this.numberOfDoors=numberOfDoors;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Number Of Doors: "+numberOfDoors);
    }
    void displayDetails(Boolean detailed){
        displayDetails();
        System.out.println("Additional Info is provided.");
    }
    static void showType(){
        System.out.println("This is a Car");
    }
}
class Truck extends Vehicle{
    double loadCapacity;
    Truck(){
        super();
        this.loadCapacity=0d;
    }
    Truck(String make,String model,int year,double loadCapacity){
        super(make,model,year);
        this.loadCapacity=loadCapacity;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Load Capacity: "+loadCapacity);
    }
    void displayDetails(Boolean detailed){
        displayDetails();
        System.out.println("Specific info provided");
    }
    static void showType(){
        System.out.println("This is Truck.");
    }
}
public class q5 {
    public static void main(String [] args){
        Car v1 = new Car("DHRUV_CARS","EAGLE",2000,5);
        Truck v2 = new Truck("DHRUV_TRUCKS","BADA",2005,25);
        Scanner sc = new Scanner (System.in);
        System.out.println("Do you want detailed info for Car?");
        Boolean detailed =sc.nextBoolean();
        if(detailed){
            v1.displayDetails(detailed);
        }
        else{
            v1.displayDetails();
        }
        System.out.println("Do you want detailed info for Truck?");
        Boolean detailed2 = sc.nextBoolean();
        if(detailed2){
            v2.displayDetails(detailed2);
        }
        else{
            v2.displayDetails();
        }
        Vehicle.showType();
        Car.showType();
        Truck.showType();
    }
}
