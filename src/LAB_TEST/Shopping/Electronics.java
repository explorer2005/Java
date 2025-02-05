package LAB_TEST.Shopping;

public class Electronics extends Item{
    int warranty;
    String brand;

    Electronics(){
        super();
        this.warranty=0;
        this.brand="NONE";
    }
    public Electronics(String productId, String productName, double price, int warranty, String brand){
        super(productId,productName,price);
        this.warranty=warranty;
        this.brand=brand;
    }
    public String getDetails(){
        return "Product ID: "+productId+", Product Name: "+productName+", Warranty: "+warranty+", Brand: "+brand;
    }
}
