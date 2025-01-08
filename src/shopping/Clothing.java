package shopping;
import java.util.*;
public class Clothing extends Item{
    String size;
    String material;

    public Clothing(String productId, String productName, double price, String size, String material){
        super(productId,productName,price);
        this.size=size;
        this.material=material;
    }
    public void getDetails() throws ProductNotAvailableException,InvalidProductException{
        super.getDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        size=sc.next();
        System.out.println("Enter material: ");
        material=sc.next();
    }
    public void printDetails(){
        super.printDetails();
        System.out.println("Size: "+size);
        System.out.println("Material: "+material);
    }
}
