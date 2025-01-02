package com.company;
//abstract class pen{
//    abstract void write();
//    abstract void refill();
//}
//class fountainPen extends pen{
//    void write(){
//        System.out.println("Writing");
//    }
//    void refill(){
//        System.out.println("Refilling");
//    }
//    void changeNib(){
//        System.out.println("Changeable nibs");
//    }
//}
//interface BasicAnimal{
//    void eat();
//    void sleep();
//}
//class Monkey{
//    void jump(){
//        System.out.println("Jumping");
//    }
//    void bite(){
//        System.out.println("Biting");
//    }
//}
//class Human extends Monkey implements BasicAnimal{
//    void human(){
//        System.out.println("Human class activated");
//    }
//    public void eat(){
//        System.out.println("Eating");
//    }
//    public void sleep(){
//        System.out.println("Sleeping");
//    }
//}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends Telephone{
    void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("Lifting");
    }
    void disconnect(){
        System.out.println("Disconnecting");
    }
    void faltu(){
        System.out.println("Aisa hi");
    }
}
public class practice11 {
    public static void main(String[] args) {
//        fountainPen hello = new fountainPen();
//        hello.changeNib();
//          Human dhruv = new Human();
//          dhruv.human();
//          dhruv.eat();
//          dhruv.sleep();
//          dhruv.jump();
//          dhruv.bite();
        Telephone tt= new SmartPhone();
        tt.ring();
        tt.lift();
        tt.disconnect();
        //tt.faltu();
    }
}
