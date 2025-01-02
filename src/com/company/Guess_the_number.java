package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    int guess;
    private int noOfGuess;
    int generatedNumber;
    Game(){
        generatedNumber=new Random().nextInt(100);
        noOfGuess=1;
    }
    public void getNumber(){
        Scanner scan = new Scanner(System.in);
        //System.out.println("Generated Number: "+generatedNumber);
        int k=scan.nextInt();
        while(k!=generatedNumber) {
            noOfGuess++;
            if (k > generatedNumber) {
                System.out.println("The guessed number is bigger than the generated number, try again");
            }
            if (k < generatedNumber) {
                System.out.println("The guessed number is smaller than the generated number, try again");
            }
            k = scan.nextInt();
        }
        System.out.println("Yes the guessed number is same as generated number which is: "+generatedNumber+" ,Number of guesses are: "+noOfGuess);
    }

}
public class Guess_the_number {
    public static void main(String[] args) {
        System.out.println("Enter the number between 0 to 100 to guess the answer");
        Game g1 = new Game();
        g1.getNumber();
    }
}
