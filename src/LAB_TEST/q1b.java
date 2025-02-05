package LAB_TEST;
class Book {
    String bookTitle;
    String author;
    boolean availability;

    public Book(String bookTitle,String author,boolean availability){
        this.bookTitle=bookTitle;
        this.author=author;
        this.availability=availability;
    }
    public boolean borrow(){
        if(availability){
            availability=false;
            System.out.println(Thread.currentThread().getName()+"Book borrowed successfully");

            return true;
        }
        else{
            System.out.println("The book is already borrowed");
            return false;
        }
    }
    public void returnBook(){
        availability=true;
        System.out.println("Book returned successfully");
    }
}
class User implements Runnable{
    Book book;
    User(Book book){
        this.book=book;
    }
    public void execute(){
        if(book.borrow()) {
            try {
                Thread.sleep(10000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            book.returnBook();
        }
    }
    public void run(){
        execute();
    }
}
public class q1b {
    public static void main(String [] args){
        Book b1 = new Book("MATHS","DHRUV_GUPTA",true);
        Book b2 = new Book("SCIENCE","DHRUV",true);
        User u1 = new User(b1);
        User u2 = new User(b2);
        Thread t1 = new Thread(u1,"User 1");
        Thread t2 = new Thread(u2,"User 2");
        t1.start();
        t2.start();
        while(t1.isAlive()||t2.isAlive()){
            try{
                t1.join();
                t2.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
