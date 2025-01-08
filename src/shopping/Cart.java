package shopping;

import java.util.ArrayList;

public class Cart {
    ArrayList<Item> cart = new ArrayList<>();
    public void addCart(Item item, boolean inStock) throws ProductNotAvailableException, InvalidProductException {
            if (item == null) {
                throw new ProductNotAvailableException("Null:");
            }
            if(!inStock){
                throw new InvalidProductException("Invalid");
            }
            cart.add(item);

    }

    public double totalPrice(){
        double ans=0;
        for(Item items:cart){
            ans+=items.price;

        }
        return ans;
    }
}
