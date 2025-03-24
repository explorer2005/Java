package LAB_TEST;
class B{
    int a;
    int b;
    B(int a,int b){
        this.a=a;
        this.b=b;
    }
    void math(int c,int d){
        c=15;
        d=30;
    }
    void math(B c){
        c.a=15;
        c.b=30;
    }

    void display(){
        System.out.println(a+" "+b);
    }
}
public class refval {
    public static void main(String [] args){
        B k = new B(2,5);
        System.out.println("Before Calling math: ");
        k.display();
        k.math(2,5);
        System.out.println("After pass by value");
        k.display();
        k.math(k);
        System.out.println("After pass by reference");
        k.display();
    }
}
