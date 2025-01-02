package com.company;
import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main (String[] args){
        Random random = new Random();
        int computer=random.nextInt(3)+1;
        int a;
        do {
            System.out.println("The options are as follows:");
            System.out.println("1:-Rock \n2:-Paper \n3:-Scissor");
            System.out.println("Enter the number by the user");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            if (computer == ch) {
                System.out.println("draw as you both selected: " + computer);
            } else if ((computer == 1 && ch == 3) || (computer == 2 && ch == 1) || (computer == 3 && ch == 2)) {
                System.out.println("You lost as option selected by you is: " + ch + " ,Where as the computer selected: " + computer);
            } else {
                System.out.println("You won as you selected: " + ch + " ,where as the computer selected: " + computer);
            }
            System.out.println("Wanna play more? \nSelect the option\n 1:-Yes\n 2:-No");
            a=sc.nextInt();
        }while(a!=2);
        //1=rock
        //2=paper
        //3=scissor 
    }
}
