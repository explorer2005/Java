package application;
import shopping.*;
public class Main {
    public static void main(String[] args) {
        Cart c1 = new Cart();
        try{
            Electronics e = new Electronics("93328","Television",258963,8,"Lenovo");
            Clothing c = new Clothing("96325","Woollen",258,"XXXL","Nylon");

            c1.addCart(e,true);
            c1.addCart(c,true);
            //c1.addCart(e,false);
            //c1.addCart(null,true);

        }catch(ProductNotAvailableException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidProductException e){
            System.out.println((e.getMessage()));
        }
        System.out.println("Total Cart Value is: "+c1.totalPrice());
    }
}
