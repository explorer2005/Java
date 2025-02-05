package LAB_TEST;
import java.util.*;
public class q7b {
    public static void main(String [] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("DHRUV");
        names.add("AVNI");
        names.add("DEEPTI");
        names.add("ANKUSH");
        names.add("ESHA");
        names.add("RIYA");
        names.add("AMIR");

        names.stream()
                .filter(name->name.startsWith("A"))
                .forEach(System.out::println);
    }
}
