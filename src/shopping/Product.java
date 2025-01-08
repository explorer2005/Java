package shopping;

public interface Product {
    void getPrice();
    void getDetails() throws ProductNotAvailableException,InvalidProductException;
    void printDetails();
}
