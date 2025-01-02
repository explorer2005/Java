package com.company;
class NegativeRadiusException extends Exception{
    public String toString(){
        return ("The radius cannot be negative");
    }
    public String getMessage(){
        return ("The Radius Cannot Be Negative");
    }
}
public interface throw_throws {
    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        try {
            double sc = area(-6);
            System.out.println("The ans is: "+sc);
        }catch(NegativeRadiusException e){
            System.out.println(e);
        }
    }
}
