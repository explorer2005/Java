package LAB_TEST.Application;
import java.util.*;
import LAB_TEST.Shopping.*;
public class Main {
    public static void main(String [] args){
        Cart c1 = new Cart();
        Electronics i1 = new Electronics("DHRUV_001","LED",963258,5,"DHRUV");
        Clothing i2 = new Clothing("DHRUV_002","CLOTH",963,"XXL","SYNTHETIC");
        try{
            c1.addCart(i1,true);
            c1.addCart(i2,true);
            c1.addCart(null,true);
            c1.addCart(i2,false);
        }catch(ProductNotAvailableException e){
            System.out.println(e.getMessage());
        }catch(InvalidProductException e){
            System.out.println(e.getMessage());
        }
        i1.printDetails();
        i2.printDetails();
        System.out.println("Total price: "+c1.totalPrice());
    }
}
