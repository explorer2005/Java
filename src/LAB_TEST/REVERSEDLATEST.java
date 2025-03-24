package LAB_TEST;
import java.util.*;
interface StringProcessor5{
    String process(String input);
}
public class REVERSEDLATEST {
    public static void main(String [] args){
        StringProcessor5 processor = (input)->{
            String reversed = new StringBuilder(input).reverse().toString();
            return reversed.toUpperCase();
        };

        String[] s={"hello","hi","bye","tata"};
        for(String str:s){
            System.out.println("Original: "+str+" |Processed: "+processor.process(str));
        }
    }

}
