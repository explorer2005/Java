package LAB_TEST;
class Flight{
    String flightNumber;
    String airline;
    double basePrice;

    Flight(){
        this.flightNumber="None";
        this.airline="None";
        this.basePrice=0d;
    }
    Flight(String flightNumber, String airline, double basePrice){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.basePrice=basePrice;
    }
    void displayDetails(){
        System.out.println("Flight Number: "+flightNumber);
        System.out.println("Airline: "+airline);
        System.out.println("Base Price: "+basePrice);
    }
}
class DomesticFlight extends Flight{
    double domesticTaxRate;
    DomesticFlight(){
        super();
        this.domesticTaxRate=0d;
    }
    DomesticFlight(String flightNumber, String airline, double basePrice, double domesticTaxRate){
        super(flightNumber,airline,basePrice);
        this.domesticTaxRate=domesticTaxRate;
    }

    double calculatePrice(){
        double totalPrice=basePrice+(domesticTaxRate*basePrice)/100;
        return totalPrice;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Domestic Tax Rate: " + domesticTaxRate);
        System.out.println("Total price is: "+calculatePrice());
    }
}
class InternationalFlight extends Flight{
    double internationalTaxRate;
    double customsFee;
    InternationalFlight(){
        super();
        this.internationalTaxRate=0d;
        this.customsFee=0d;
    }
    InternationalFlight(String flightNumber, String airline,double basePrice,double internationalTaxRate, double customsFee){
        super(flightNumber,airline,basePrice);
        this.internationalTaxRate=internationalTaxRate;
        this.customsFee=customsFee;
    }
    double calculatePrice(){
        return basePrice+customsFee+(internationalTaxRate*basePrice)/100;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("International Tax Rate: "+internationalTaxRate);
        System.out.println("Customs Fee: "+customsFee);
        System.out.println("Total Price: "+calculatePrice());
    }
}
public class q1 {
    public static void main(String [] args){
        DomesticFlight f1 = new DomesticFlight("DHRUV084","DHRUV_CONNECT",9000d,15);
        InternationalFlight f2 = new InternationalFlight("DHRUV001","DHRUV_INTERNATIONAL",98000D,20,4500);
        f1.displayDetails();
        f2.displayDetails();
    }
}
