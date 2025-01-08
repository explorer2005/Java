package Questions;
import java.util.Random;
class Book extends Thread{
    String bookTitle;
    String author;
    boolean availability;

    Book(String bookTitle,String author){
        this.bookTitle=bookTitle;
        this.author=author;
        this.availability=true;
    }
    synchronized boolean borrow(){
        if(availability){
            availability=false;
            System.out.println(Thread.currentThread().getName()+"Book issued: "+bookTitle);
            return true;
        }
        else{
            System.out.println(Thread.currentThread().getName()+"Book is not issued: "+bookTitle);
            return false;
        }
    }
    synchronized void returnBook(){
        availability=true;
        System.out.println(Thread.currentThread().getName()+"Book returned successfully: "+bookTitle);
    }
}
class User implements Runnable{
    Book book;
    User(Book book){
        this.book=book;
    }
    public void run(){
        if(book.borrow()){
            try{
                Thread.sleep(new Random().nextInt(3000)+1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            book.returnBook();
        }
    }
}
public class q3b {
    public static void main(String[] args) {
        Book book = new Book("Mathematics","Dhruv");
        Thread user1 = new Thread(new User(book),"User1");
        Thread user2 = new Thread(new User(book),"User2");
        Thread user3 = new Thread(new User(book),"User3");

        user1.start();
        user2.start();
        user3.start();

        try{
            user1.join();
            user2.join();
            user3.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Done!");
    }
}
