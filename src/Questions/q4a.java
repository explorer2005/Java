package Questions;
import java.util.*;
class MenuItem{
    final String name;
    double price;
    public MenuItem(){
        this.name="NULL";
        this.price=0d;
    }
    public MenuItem(String name, double price){
        this.name=name;
        this.price=price;
    }
    final void displayDetails(){
        System.out.println("Name of food item is: "+name);
        System.out.println("Price of the food item is: "+price);
    }
}
class FoodItem extends MenuItem{
    boolean isVegetarian;
    FoodItem(){
        super();
        this.isVegetarian=true;
    }
    FoodItem(String name,double price, boolean isVegetarian){
        super(name,price);
        this.isVegetarian=isVegetarian;
    }
    void displayFoodDetails(){
        super.displayDetails();
        System.out.println("Is the food item vegetarian: "+isVegetarian);
    }
}
class DrinkItem extends MenuItem{
    boolean isAlcoholic;
    DrinkItem(){
        super();
        this.isAlcoholic=true;
    }
    DrinkItem(String name,double price, boolean isAlcoholic){
        super(name,price);
        this.isAlcoholic=isAlcoholic;
    }
    void displayDrinkDetails(){
        super.displayDetails();
        System.out.println("Is the drink alcoholic: "+isAlcoholic);
    }
}
public class q4a {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items to be ticked from menu");
        int n=sc.nextInt();
        MenuItem[] menuitem=new MenuItem[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of the "+i+1+" foodItem");
            System.out.println("Enter the name of the food item");
            String FoodName=sc.next();
            System.out.println("Enter the price of the food item");
            double FoodPrice=sc.nextDouble();
            System.out.println("Enter the 1 for Food Item and 2 for Drink Item");
            int k = sc.nextInt();
            if(k==1){
                System.out.println("Enter true if its vegetarian and false if its not vegetarian");
                boolean FoodVegetarian = sc.nextBoolean();
                menuitem[i] = new FoodItem(FoodName,FoodPrice,FoodVegetarian);
            }
            else{
                System.out.println("Enter true if its alcoholic and false if its not alcoholic");
                boolean DrinkAlcoholic = sc.nextBoolean();
                menuitem[i] = new DrinkItem(FoodName,FoodPrice,DrinkAlcoholic);
            }
        }
        for(MenuItem item:menuitem){
            if(item instanceof FoodItem){
                ((FoodItem)item).displayFoodDetails();
            }
            else{
                ((DrinkItem)item).displayDrinkDetails();
            }
        }
    }
}
