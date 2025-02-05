package LAB_TEST.Shopping;
import java.util.*;
public class Cart {
    ArrayList<Item> cart = new ArrayList<>();
    public void addCart(Item item,boolean inStock)throws ProductNotAvailableException,InvalidProductException{
        if(item==null){
            throw new InvalidProductException("Invalid product");
        }
        if(!inStock){
            throw new ProductNotAvailableException("Not in Stock");
        }
        cart.add(item);
    }
    public double totalPrice(){
        double ans=0;
        for(Item item:cart){
            ans+=item.price;
        }
        return ans;
    }
}
