package shopping;
import java.util.*;
public class Electronics extends Item{
    int warranty;
    String brand;

    public Electronics(String productId, String productName, double price, int warranty,String brand){
        super(productId,productName,price);
        this.warranty=warranty;
        this.brand=brand;

    }

    public void getDetails() throws ProductNotAvailableException, InvalidProductException {
        super.getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter warranty period: ");
        warranty=sc.nextInt();
        System.out.println("Enter Brand: ");
        brand=sc.next();
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Warranty: "+warranty);
        System.out.println("Brand: "+brand);
    }
}
