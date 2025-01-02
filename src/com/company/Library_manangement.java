package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class bLibrary {
    Scanner s = new Scanner(System.in);
    ArrayList<String> books = new ArrayList<>();
    int l = 0;
    int k = 0;

    public void add() {
        System.out.println("Enter the number of books to be added");
        int a = s.nextInt();
        k = k + a;
        for (int i = 0; i < k; i++) {
            System.out.println("Enter the name of the book to be added");
            String b = s.nextLine();
            books.add(b);
        }
        System.out.println("Books added successfully");
    }

    public void issue() {
        System.out.println("Enter the name of the book to be issued");
        String m = s.nextLine();
        System.out.println("Checking whether its present  or  not.....");
        for (int i = 0; i < k; i++) {
            if (books.contains(m)) {
                System.out.println("Book is found.");
                System.out.println("Enter the number of days for which the book is to be issued");
                l = s.nextInt();
                System.out.println("Book issued: " + m + " ,for " + l + " days");
                books.remove(m);
            }
        }
    }

    public void returnbook(){
        System.out.println("Enter the name of the book ");
        String m = s.nextLine();
        books.add(m);
        System.out.println("Enter the issue date: ");
        String issueDateStr = s.nextLine();
        System.out.println("Enter the return date:");
        String returnDateStr = s.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate issueDate = LocalDate.parse(issueDateStr, formatter);
        LocalDate returnDate = LocalDate.parse(returnDateStr, formatter);
        long daysBetween = ChronoUnit.DAYS.between(issueDate, returnDate);
        if(daysBetween>l){
            System.out.println("Fine issued because of late return 2 rupees per day");
            System.out.println("Pay rupees: "+(daysBetween-l)*2);
        }
    }

    public void available(){
        System.out.println("Available books are:");
        for(String names:books){
            System.out.println(names);
        }
    }
}
public class Library_manangement {
    public static void main(String[] args) {
        int r;
        bLibrary first = new bLibrary();
        do {
            System.out.println("1.Add a book\n2.Issue a book\n3.Return a book\n4.Available  books");
            System.out.println("Enter the option to opt:");
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            switch (k) {
                case 1:
                    first.add();
                    break;
                case 2:
                    first.issue();
                    break;
                case 3:
                    first.returnbook();
                    break;
                case 4:
                    first.available();
                    break;
                default:
                    System.out.println("Enter a valid input");
                    break;
            }
            System.out.println("Want to continue more?\n Select the options:\n1.Yes\n2.No");
            r=sc.nextInt();
        }while(r!=2);
    }
}
