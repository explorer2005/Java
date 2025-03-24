package LAB_TEST;
import java.util.*;
interface StringProcessor2{
    String process(String input);
}

public class REVERSING {
    public static void main(String[] args){
        StringProcessor2 processor = (input)->{
            String reversed = new StringBuilder(input).reverse().toString();
            return reversed.toUpperCase();
        };
        String[] strings={"hello","hi","bye","namasta"};
        for(String s:strings){
            System.out.println("Original: "+s+" |Modified: "+processor.process(s));
        }
    }
}
