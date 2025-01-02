package com.company;
class meth{
    public void divide(){
        int a=5;
        int b=0;
        try{
            int c=a/b;
            System.out.println("Tha answer is: "+c);
        }catch(Exception e){
            System.out.println("There is an error occured: "+e);
        }
    }
}
public class tryCatch {
    public static void main(String[] args) {
        meth first = new meth();
        first.divide();
    }
}
