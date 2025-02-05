package LAB_TEST;
import java.util.*;
interface RentalService{
    boolean checkAvailability();
    void rent();
    void returnCar();
    double calculateRentalCost(int days,double distance);
}
class Carn implements RentalService{
    String make;
    String model;
    int year;
    double dailyRate;
    boolean isAvailable;
    Carn(String make,String model,int year, double dailyRate,boolean isAvailable){
        this.make=make;
        this.model=model;
        this.year=year;
        this.dailyRate=dailyRate;
        this.isAvailable=isAvailable;
    }
    public boolean checkAvailability(){
        return isAvailable;
    }
    public void rent(){
        if(isAvailable){
            isAvailable=false;
            System.out.println("Car rented successfully");
        }
    }
    public void returnCar() {
        if (isAvailable) {
            System.out.println("Returning a wrong car");
        } else {
            System.out.println("Car returned successfully");
            isAvailable = true;
        }
    }
    public double calculateRentalCost(int days,double distance){
        return days*dailyRate+distance*2;
    }
    public void displayDetails(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Daily Rate: "+dailyRate);
        System.out.println("Availability: "+isAvailable);
    }
    public void compareRates(Carn other){
        Carn cheaper=(this.dailyRate>other.dailyRate)?other:this;
        System.out.println("Details of cheaper car are: ");
        cheaper.displayDetails();
    }
}
class CarRentalService{
    ArrayList<Carn> arr = new ArrayList<>();
    public void addCar(Carn car){
        if(car.isAvailable) {
            arr.add(car);
            System.out.println("Car added successfully");
        }
    }
    public Carn findCar(String make,String model){
        for(Carn find:arr){
            if(make.equals(find.make)&&model.equals(find.model)){
                System.out.println("Car found successfully");
                return find;
            }
        }
        System.out.println("Car not found");
        return null;
    }
    public void displayAvailableCars(){
        System.out.println("Displaying names of all available cars: ");
        for(Carn car:arr){
            if(car.isAvailable) {
                car.displayDetails();
            }
        }
    }
}
public class q2 {
    public static void main(String [] args){
        CarRentalService r = new CarRentalService();
        Carn c1 = new Carn("DHRUV_CARS","FASTX",2000,5900,true);
        Carn c2 = new Carn("GUPTA_CARS","FASTXX",2005,8520,true);
        r.addCar(c1);
        r.addCar(c2);
        String findMake=null;
        String findModel=null;
        Carn c = null;
        while(true){
            System.out.println("Select\n1.Availability\n2.Rent a Car\n3.Return a Car\n4.Compare rates\n5.Calculate Rental Cost\n6.Display all availabilties\n");
            Scanner sc = new Scanner(System.in);
            int k=sc.nextInt();
            switch(k){
                case 1:
                    System.out.println("Enter make and model respectively");
                    findMake=sc.next();
                    findModel=sc.next();
                    c=r.findCar(findMake,findModel);
                    c.checkAvailability();
                    break;
                case 2: System.out.println("Enter make and model respectively");
                    findMake=sc.next();
                    findModel=sc.next();
                    c=r.findCar(findMake,findModel);
                    c.rent();
                    break;
                case 3:
                    System.out.println("Which car you wanted to return?");
                    String ans= sc.next();
                    if(ans=="c1"){
                        c1.returnCar();
                    }
                    else if(ans=="c2"){
                        c2.returnCar();
                    }
                    break;
                case 4:System.out.println("Enter make and model respectively");
                    findMake=sc.next();
                    findModel=sc.next();
                    c=r.findCar(findMake,findModel);
                    System.out.println("Enter the make andmodel of the car to be compared");
                    String findMake2=sc.next();
                    String findModel2=sc.next();
                    Carn ck=r.findCar(findMake2,findModel2);
                    c.compareRates(ck);
                    break;
                case 5:System.out.println("Enter make and model respectively");
                    findMake=sc.next();
                    findModel=sc.next();
                    c=r.findCar(findMake,findModel);
                    System.out.println("Enter number of days and distance respectively");
                    int day = sc.nextInt();
                    double dist = sc.nextDouble();
                    c.calculateRentalCost(day,dist);
                    break;
                case 6:r.displayAvailableCars();
                       break;
            }
        }
    }
}
