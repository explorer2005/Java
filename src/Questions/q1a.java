package Questions;
class Flight{
    String flightNumber;
    String airline;
    double basePrice;

    Flight(){
        this.flightNumber="6E5158";
        this.airline="Indigo";
        this.basePrice=0.0d;
    }
    Flight(String flightNumber, String airline, double basePrice){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.basePrice=basePrice;
    }
    void displayDetails(){
        System.out.println("Flight Number is: "+flightNumber);
        System.out.println("Airline: "+airline);
        System.out.println("Base Price: "+basePrice);
    }
}
class DomesticFlight extends Flight{
    double domesticTaxRate;
    DomesticFlight(){
        super();
        this.domesticTaxRate=0.0d;
    }
    DomesticFlight(String flightNumber, String airline, double basePrice, double domesticTaxRate){
        super(flightNumber,airline,basePrice);
        this.domesticTaxRate=domesticTaxRate;
    }
    void  displayDetails(){
        super.displayDetails();
        System.out.println("Domestic Tax Rate is: "+domesticTaxRate);
        System.out.println("The total price is: "+calculatePrice(basePrice));
    }
    double calculatePrice(double basePrice){
        double totalPrice;
        totalPrice=basePrice+((domesticTaxRate/100)*basePrice);
        return totalPrice;
    }
}
class InternationalFlight extends Flight{
    double internationalTaxRate;
    double customFee;
    InternationalFlight(){
        super();
        this.internationalTaxRate=0.0d;
        this.customFee=0.0d;
    }
    InternationalFlight(String flightNumber, String airline, double basePrice, double internationalTaxRate, double customFee){
        super(flightNumber,airline,basePrice);
        this.internationalTaxRate=internationalTaxRate;
        this.customFee=customFee;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("International Tax Rate: "+internationalTaxRate);
        System.out.println("Custom fees: "+customFee);
        System.out.println("The total price is: "+calculatePrice(basePrice));
    }
    double calculatePrice(double basePrice){
        double totalPrice;
        totalPrice = basePrice + customFee + ((internationalTaxRate/100)*basePrice);
        return totalPrice;
    }
}
public class q1a {
    public static void main(String[] args) {
        DomesticFlight f1 = new DomesticFlight("QP1350","Akasa Air",6500,5);
        InternationalFlight f2 = new InternationalFlight("AI1956","Air India",69305,15,5600);
        f1.displayDetails();
        f2.displayDetails();
    }
}
