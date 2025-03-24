package LAB_TEST;
import java.util.*;
public class STREAM2 {
    public static void main(String [] args){
        ArrayList<String> named = new ArrayList<>();
        named.add("DHRUV");
        named.add("RIYA");
        named.add("ANKUSH");
        named.add("RIYA");
        named.add("ESHA");

        named.stream()
                .filter(name->name.startsWith("A"))
                .forEach(System.out::println);
    }
}
