package com.company;
class Employee{
    String name;
    int salary;
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }


}
public class Basicpractice {
    public static void main(String[] args) {
        Employee dhruv = new Employee();
        dhruv.setName("DHRUV");
        dhruv.setSalary(123000000);
        System.out.println(dhruv.getName());
        System.out.println(dhruv.getSalary());
    }
}
