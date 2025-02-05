package LAB_TEST.Shopping;

public class Clothing extends Item{
    String size;
    String material;

    Clothing(){
        super();
        this.size="NONE";
        this.material="NONE";
    }
    public Clothing(String productId, String productName, double price, String size, String material){
        super(productId,productName,price);
        this.size=size;
        this.material=material;
    }
    public String getDetails(){
        return "Product ID: "+productId+", Product Name: "+productName+", Size: "+size+", material: "+material;
    }
}
