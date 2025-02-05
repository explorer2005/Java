package LAB_TEST.Shopping;

public abstract class Item implements Product{
    String productId;
    String productName;
    double price;
    Item(){
        this.productId="NONE";
        this.productName="NONE";
        this.price=0d;
    }

    Item(String productId, String productName, double price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }

    public void getPrice(){
        System.out.println("The price is: "+price);
    }
    public void printDetails(){
        System.out.println(getDetails());
    }
}
