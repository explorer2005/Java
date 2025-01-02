package com.company;
class Dhruv{
    int age;
    String name;
    Dhruv(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println("The name is"+name);
        System.out.println("The age is"+age);
    }
}
public class customclass {
    public static void main(String[] args) {
        Dhruv dhruv = new Dhruv(14,"Riya");
        dhruv.age=19;
        dhruv.name="Dhruv";
        System.out.println("The age is: "+dhruv.age);
        System.out.println("The name is: "+dhruv.name);

        System.out.println("Printing the default value from instances");
        dhruv.display();
    }
}
