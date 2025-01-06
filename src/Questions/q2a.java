package Questions;
import java.util.*;
interface RentalService{
    void checkAvailability();
    void rent();
    void returnCar();
    void calculateRental(int days, double distance);
}
class Car implements RentalService{
    int days;
    double distance;
    String make;
    String model;
    int year;
    double dailyRate;
    boolean isAvailable;
    Car(){
        this.days=0;
        this.distance=0d;
        this.make="NULL";
        this.model="NULL";
        this.year=0;
        this.dailyRate=0d;
        this.isAvailable=false;
    }
    Car(String make, String model, int year, double dailyRate, boolean isAvailable){
        this.make=make;
        this.model=model;
        this.year=year;
        this.dailyRate=dailyRate;
        this.isAvailable=isAvailable;
    }
    void displayDetails(){
        System.out.println("Maker: "+make);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Daily Rates: "+dailyRate);
        System.out.println("Availability: "+isAvailable);
    }
    public void checkAvailability(){
        if(isAvailable){
            System.out.println("Yes the Car is available");
        }
        else{
            System.out.println("No the car is not available");
        }
    }
    public void rent(){
        if(isAvailable){
            System.out.println("Car rented successfully");
            isAvailable=false;
        }
        else{
            System.out.println("Car is not available for rent");
        }
    }
    public void returnCar(){
        if(isAvailable){
            System.out.println("Entered the wrong car");
        }
        else{
            System.out.println("Car returned successfully");
            isAvailable=true;
        }
    }
    public void calculateRental(int days, double distance){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of days to be rented");
        days=sc.nextInt();
        System.out.println("Enter the distance travelled");
        distance=sc.nextDouble();
        double rent=(days*dailyRate)+(distance*5);
        System.out.println("The rent of the car is: "+rent);
    }
    Car compareRates(Car other){
        Car cheapCar= this.dailyRate<other.dailyRate?this:other;
        System.out.println("The details of cheaper car are: ");
        cheapCar.displayDetails();
        return cheapCar;

    }
}
class CarRentalService{
    ArrayList<Car> caradd = new ArrayList<>();
    void addCar(Car car){
        if(car.isAvailable) {
            caradd.add(car);
            System.out.println("The mentioned car is added");
        }
    }
    Car findCar(String make, String model){
        for(Car car: caradd){
            if(make.equals(car.make) && model.equals(car.model) ){
                System.out.println("Yes the car is found");
                car.displayDetails();
                return car;
            }
//            else{
//                System.out.println("The mentioned car is not available");
//                return false;
//            }
        }
        System.out.println("The mentioned car is not found");
        return null;
    }
    void displayAvailableCars(){
        for(int i=0;i<caradd.size();i++){
            System.out.println("Displaying car");
            (caradd.get(i)).displayDetails();
        }
    }
}
public class q2a{
    public static void main(String[] args) {
        CarRentalService rentalService = new CarRentalService();
        rentalService.addCar(new Car("Hyundai", "Asta", 2000, 1500, true));
        rentalService.addCar(new Car("Mahindra", "Xl6", 2010, 1700, true));
        rentalService.addCar(new Car("GMC", "Cadillac", 1980, 1400, true));
        rentalService.addCar(new Car("Corvett", "DodgeChallenger", 1950, 2000, true));
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want the list of all the available cars? Type 1 for yes and 2 for no");
        int j=sc.nextInt();
        if(j==1) {
            System.out.println("Displaying all the available cars");
            rentalService.displayAvailableCars();
        }
        Car car=null;
        System.out.println("Enter the make and model respectively of the car to be found");
        String findMake=sc.next();
        String findModel=sc.next();
        car=rentalService.findCar(findMake,findModel);
        int l;
        do{
            System.out.println("Select the correct option: ");
            System.out.println("1. Rent");
            System.out.println("2. checkAvailability");
            System.out.println("3. return Car");
            System.out.println("4. calculate rental cost");
            System.out.println("5. display details");
            System.out.println("6. compare rates");
            System.out.println("7. display all available cars");
            System.out.println("8. exit");
            System.out.println("Enter the option from above");
            l= sc.nextInt();
            switch(l){
                case 1: System.out.println("Enter the make and model respectively of the car to be rented");
                        String findMake2=sc.next();
                        String findModel2=sc.next();
                        car = rentalService.findCar(findMake2, findModel2);
                        if(car!=null){
                            car.rent();
                        }
                        break;
                case 2: System.out.println("Enter the make and model respectively of the car to be rented");
                        String findMake3=sc.next();
                        String findModel3=sc.next();
                        car = rentalService.findCar(findMake3, findModel3);
                        if(car!=null){
                            car.checkAvailability();
                        }
                        break;
                case 3: System.out.println("Enter the make and model respectively of the car to be rented");
                        String findMake4=sc.next();
                        String findModel4=sc.next();
                        car = rentalService.findCar(findMake4, findModel4);
                        if(car!=null){
                            car.returnCar();
                        }
                        break;
                case 4: System.out.println("Enter the make and model respectively of the car to be rented");
                        String findMake5=sc.next();
                        String findModel5=sc.next();
                        car = rentalService.findCar(findMake5, findModel5);
                        if(car!=null){
                            if(car.isAvailable) {
                                car.calculateRental(0, 0);
                            }
                            else{
                                System.out.println("The car is currently rented");
                            }
                        }
                        break;
                case 5: System.out.println("Enter the make and model respectively of the car to be rented");
                        String findMake6=sc.next();
                        String findModel6=sc.next();
                        car = rentalService.findCar(findMake6, findModel6);
                        if(car!=null){
                            car.displayDetails();
                        }
                        break;
                case 6: System.out.println("Enter the make and model respectively of the car to be rented");
                        String findMake7=sc.next();
                        String findModel7=sc.next();
                        car = rentalService.findCar(findMake7, findModel7);
                        if(car!=null){
                            System.out.println("Enter the make and model respectively of the car to be compared");
                            String findMake8=sc.next();
                            String findModel8=sc.next();
                            Car car7 = rentalService.findCar(findMake8, findModel8);
                            if(car7!=null) {
                                car.compareRates(car7);
                            }
                        }
                        break;
                case 7: rentalService.displayAvailableCars();
                        break;
//                default:
//                    System.out.println("Wrong input, enter a valid one");
//                    break;
                case 8:
                    System.out.println("Thank you for using our service!");
                    break;

                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 8");
                    break;
            }
        }while(l!=8);
    }
}