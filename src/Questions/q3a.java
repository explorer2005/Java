package Questions;
import java.util.*;
class WeatherStation{
    String location;
    String stationId;
    WeatherStation(){
        this.location=null;
        this.stationId=null;
    }
    WeatherStation(String location, String stationId){
        this.location=location;
        this.stationId=stationId;
    }
    void displayData(){
        System.out.println("Location: "+location);
        System.out.println("StationId: "+stationId);
        String str1=location.concat(" ").concat(stationId);
        System.out.println("Concatenation of the String: "+str1);
        String str2=str1.substring(0,8);
        System.out.println("Substring representation: "+str2);
        System.out.println("Representing Comparision: "+location.compareTo(stationId));
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
        StringBuffer sb = new StringBuffer("Usage of String Buffer: ");
        sb.append(location);
        System.out.println("Appended: "+sb);
        sb.replace(0,9,"replaced");
        System.out.println("Replacement: "+sb);
        sb.reverse();
        System.out.println("Reversing: "+sb);
    }
}
class rainfallStation extends WeatherStation{
    double rainfall;
    rainfallStation(){
        super();
        this.rainfall=0d;
    }
    rainfallStation(String location, String stationId, double rainfall){
        super(location,stationId);
        this.rainfall=rainfall;
    }
    void displayData(){
        super.displayData();
        System.out.println("Rainfall: "+rainfall);
        StringBuffer sb = new StringBuffer("Representing the String Buffer: ");
        sb.insert(0,"Inserting");
        System.out.println("Inserting: "+sb);
        sb.delete(0,6);
        System.out.println("Deleting: "+sb);
        sb.replace(0,7,"Replacing");
        System.out.println("Replacing: "+sb);
    }
}
public class q3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of stations to be added: ");
        int n = sc.nextInt();
        WeatherStation [] station = new WeatherStation[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the location: ");
            String putLocation = sc.next();
            System.out.println("Enter the Station ID: ");
            String putStationId = sc.next();
            System.out.println("Enter 1 for Temperature Station and 2 for Rainfall Station");
            int k = sc.nextInt();
            if(k==1){
                System.out.println("Enter Temperature: ");
                double putTemperature = sc.nextDouble();
                station[i]=new TemperatureStation(putLocation,putStationId,putTemperature);
            }else{
                System.out.println("Enter rainfall: ");
                double putRainfall = sc.nextDouble();
                station[i]=new rainfallStation(putLocation,putStationId,putRainfall);
            }
        }
        System.out.println("Printing the details: ");
        for(WeatherStation car: station){
            if(car instanceof TemperatureStation){
                System.out.println("Temperature Station: ");
                car.displayData();
            }
            else{
                System.out.println("Rainfall Station: ");
                car.displayData();
            }
        }
    }
}
