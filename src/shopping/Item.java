package shopping;
import java.util.*;
public class Item implements  Product{
    String productId;
    String productName;
    double price;

    Item(String productId, String productName, double price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    public void getPrice(){
        System.out.println("Enter the price: ");
        Scanner sc = new Scanner(System.in);
        price = sc.nextDouble();
    }
    public void getDetails() throws ProductNotAvailableException,InvalidProductException{
        System.out.println("Enter Product ID: ");
        Scanner sc = new Scanner(System.in);
        productId=sc.next();
        System.out.println("Enter Product Name: ");
        productName=sc.next();
    }
    public void printDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Product Id: "+productId);
        System.out.println("Price: "+price);
    }
}
