package LAB_TEST;
import java.util.*;
public class FILTER {
    public static void main(String[] args){
        ArrayList<String> named=new ArrayList<>();
        named.add("DHRUV");
        named.add("ESHA");
        named.add("ANKUSH");
        named.add("AMAY");
        named.add("RISHABH");
        named.add("ANUSHKA");

        named.stream()
                .filter(name->name.startsWith("A"))
                .forEach(System.out::println);
    }
}
