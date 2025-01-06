package Questions;
import java.sql.SQLOutput;
import java.util.*;
class Vehicle{
    String make;
    String model;
    int year;
    Vehicle(){
        this.make="None";
        this.model="None";
        this.year=0;
    }
    Vehicle(String make,String model, int  year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void displayDetails(){
        System.out.println("Maker: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
    void displayDetails(boolean isDetailed){
        System.out.println("Special detailed details:");
        System.out.println("Maker: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
    public static void showType(){
        System.out.println("Vehicles");
    }
}
class Car2 extends Vehicle{
    int numberOfDoors;
    Car2(){
        super();
        this.numberOfDoors=0;
    }
    Car2(String make, String model, int year, int numberOfDoors){
        super(make,model,year);
        this.numberOfDoors=numberOfDoors;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Number of doors in the car are: "+numberOfDoors);
    }
    void displayDetails(boolean detailed){
        super.displayDetails(detailed);
        System.out.println("Number of doors in the car are: "+numberOfDoors);
        showType();
    }
    public static void showType(){
        System.out.println("Car");
    }
}
class Truck extends Vehicle{
    double loadCapacity;
    Truck(){
        super();
        this.loadCapacity=0;
    }
    Truck(String make, String model, int year, double loadCapacity){
        super(make,model,year);
        this.loadCapacity=loadCapacity;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Load Capacity: "+loadCapacity);
    }
    void displayDetails(boolean detailed){
        super.displayDetails(detailed);
        System.out.println("Load Capacity: "+loadCapacity);
        showType();
    }
    public static void showType(){
        System.out.println("Truck");
    }
}
public class q5a {
    public static void main(String[] args){
        System.out.println("Enter the no of vehicles to ne entered");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Vehicle[] vehicle = new Vehicle[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the detail of: "+i+1+" Vehicle");
            System.out.println("Enter the model name: ");
            String modelVehicle = sc.next();
            System.out.println("Enter the year of manufacturing: ");
            int yearVehicle = sc.nextInt();
            System.out.println("Enter the company name: ");
            String nameVehicle= sc.next();
            System.out.println("Select 1 to enter details of a car and 2 to enter details of a truck");
            int k=sc.nextInt();
            if(k==1){
                System.out.println("Enter the number of doors of the car");
                int doorsCar=sc.nextInt();
                vehicle[i]=new Car2(nameVehicle,modelVehicle,yearVehicle,doorsCar);

            }
            else{
                System.out.println("Enter the load Capacity of the car");
                double truckLoad=sc.nextDouble();
                vehicle[i]=new Truck(nameVehicle,modelVehicle,yearVehicle,truckLoad);
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Displaying details of: "+i+1+" Vehicle");
            System.out.println("You want display detailed info or not input 1 for yes and 2 for no");
            int ans = sc.nextInt();
            if(ans==1){
                vehicle[i].displayDetails(true);
//                Car2.showType();
//                Truck.showType();
//                Vehicle.showType();
            }
            else{
                vehicle[i].displayDetails();
            }
        }
        //System.out.println("Demonstration of Dynamic dispatch is:");
//        System.out.println(Car2.showType());
    }
}
