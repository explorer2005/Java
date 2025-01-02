package com.company;
//class Phone{
//    Phone(){
//        System.out.println("Vibrating......");
//        System.out.println("Ringing......");
//    }
//}
class square{
    float side;
    square(float side){
        this.side=side;
    }
    public float area(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}
public class cellphone {
    public static void main(String[] args) {
//        Phone dhruv=new Phone();
          square s1 = new square(4.5F);
          System.out.println("The area is: "+s1.area());
        System.out.println("The area is: "+s1.perimeter());
    }
}
