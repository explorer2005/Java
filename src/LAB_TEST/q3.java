package LAB_TEST;
import java.util.*;
class WeatherStation{
    String location;
    String stationId;
    WeatherStation(){
        this.location="NONE";
        this.stationId="NONE";
    }
    WeatherStation(String location,String stationId){
        this.location=location;
        this.stationId=stationId;
    }
    void displayData(){
        System.out.println("Location: "+location);
        System.out.println("Station ID: "+stationId);
        System.out.println("Demonstrating String Handling");
        String s=location;
        System.out.println("Concatination: "+s.concat(" ").concat(stationId));
        System.out.println("Substring: "+s.substring(0,2));
        System.out.println("Comparision: "+s.compareTo(stationId));
    }
}
class TemperatureStation extends WeatherStation{
    double temperature;
    TemperatureStation(){
        super();
        this.temperature=0d;
    }
    TemperatureStation(String location,String stationId,double temperature){
        super(location,stationId);
        this.temperature=temperature;
    }
    void displayData(){
        super.displayData();
        System.out.println("Temperature: "+temperature);
        System.out.println("Demonstrating String Buffer");
        StringBuffer sb = new StringBuffer(stationId);
        System.out.println("Appending: "+sb.append(" 0052"));
        System.out.println("Replacing: "+sb.replace(0,4 ,"DHRUV"));
        System.out.println("Reversing: "+sb.reverse());
    }
}
class RainfallStation extends WeatherStation{
    double rainfall;
    RainfallStation(){
        super();
        this.rainfall=0d;
    }
    RainfallStation(String location,String stationId,double rainfall){
        super(location,stationId);
        this.rainfall=rainfall;
    }
    void displayData(){
        super.displayData();
        System.out.println("Rainfall: "+rainfall);
        System.out.println("String Buffer Handling");
        StringBuffer s = new StringBuffer(stationId);
        System.out.println("Inserting: "+s.insert(0,"Inserting"));
        System.out.println("Deleting: "+s.delete(0,5));
        System.out.println("Replacing: "+s.replace(0,5,"DHRUV"));
    }
}
public class q3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Weather stations");
        int n=sc.nextInt();
        WeatherStation[] arr =new WeatherStation[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the location: ");
            String location=sc.next();
            System.out.println("Enter stationId: ");
            String stationId = sc.next();
            System.out.println("Select 1 for Temperature Station and 2 for Rainfall Station: ");
            int k = sc.nextInt();
            if(k==1){
                System.out.println("Enter Temperature: ");
                double temperature = sc.nextDouble();
                arr[i]=new TemperatureStation(location,stationId,temperature);
                arr[i].displayData();
            }
            else{
                System.out.println("Enter rainfall: ");
                double rainfall = sc.nextDouble();
                arr[i]=new RainfallStation(location,stationId,rainfall);
                arr[i].displayData();
            }
        }
    }
}
