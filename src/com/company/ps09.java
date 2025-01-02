package com.company;
import java.util.Scanner;
class Cylinder{
    private int height;
    private int radius;

    public void set(int h,int r){
        this.height=h;
        this.radius=r;
    }
    public int geth(){
        return height;
    }
    public int getr(){
        return radius;
    }
}
public class ps09 {
    public static void main(String[] args) {
        /*Problem1*/
        Scanner scan = new Scanner(System.in);
        int h=scan.nextInt();
        int r=scan.nextInt();
        Cylinder c1=new Cylinder();
        c1.set(h,r);
        System.out.println("The ans of the TSA is:"+(2*3.14*c1.getr()*c1.geth()));
    }
}
