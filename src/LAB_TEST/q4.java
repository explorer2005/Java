package LAB_TEST;
import java.util.*;
class MenuItem{
    final String name;
    double price;
    MenuItem(){
        this.name="NULL";
        this.price=0d;
    }
    MenuItem(String name,double price){
        this.name=name;
        this.price=price;
    }
    final void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
}
class FoodItem extends MenuItem{
    Boolean isVegetarian;
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
        System.out.println("Vegetarian: "+isVegetarian);
    }
}
class DrinkItem extends MenuItem{
    boolean isAlcoholic;
    DrinkItem(){
        super();
        this.isAlcoholic=false;
    }
    DrinkItem(String name,double price,boolean isAlcoholic){
        super(name,price);
        this.isAlcoholic=isAlcoholic;
    }
    void displayDrinkDetails(){
        super.displayDetails();
        System.out.println("Alcoholic?: "+isAlcoholic);
    }
}
public class q4 {
    public static void main(String[] args){
        System.out.println("Enter the number of food items");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        MenuItem[] arr = new MenuItem[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the name: ");
            String name = sc.next();
            System.out.println("Enter the price: ");
            double price = sc.nextDouble();
            System.out.println("Enter 1 for FoodItem and 2 for DrinkItem: ");
            int k = sc.nextInt();
            if(k==1){
                System.out.println("Enter true for vegetarian and false for non vegetarian: ");
                boolean isVegetarian = sc.nextBoolean();
                arr[i]=new FoodItem(name,price,isVegetarian);
            }
            else{
                System.out.println("Enter true if alcoholic and false if not: ");
                boolean isAlcoholic = sc.nextBoolean();
                arr[i]=new DrinkItem(name,price,isAlcoholic);
            }

        }
        for(MenuItem item:arr){
            if(item instanceof FoodItem){
                ((FoodItem)item).displayFoodDetails();
            }
            else{
                ((DrinkItem)item).displayDrinkDetails();
            }
        }

    }
}
