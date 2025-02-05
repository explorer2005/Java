package LAB_TEST;
interface StringProcessor{
    String process(String input);
}
public class q4b {
    public static void main(String [] args){
        StringProcessor proccessor = (input)->{
            String reversed  = new StringBuilder(input).reverse().toString();
            return reversed.toUpperCase();
        };

        String[]string={"dhruv","gupta","ankush","esha","riya"};
        for(String str:string){
            System.out.println("Original: "+str+"| Proccessed: "+proccessor.process(str));
        }
    }
}
