package LAB_TEST;
class myObj{
    int length;
    int breadth;
    int height;

    myObj(){
        this.length=-1;
        this.breadth=-1;
        this.height=-1;
    }

    myObj(int length,int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }

    myObj(myObj c){
        length=c.length;
        breadth=c.breadth;
        height=c.height;
    }

    void printDetails(){
        System.out.println("Length: "+length);
        System.out.println("breadth: "+breadth);
        System.out.println("height: "+height);
    }
}
public class objpass {
    public static void main(String [] args){
        myObj o1 = new myObj(25,35,65);
        myObj o2 = new myObj(o1);
        o2.printDetails();
    }
}
