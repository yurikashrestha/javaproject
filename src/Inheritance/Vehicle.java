package Inheritance;

public class Vehicle {
    String brand;
    Vehicle (String brand){
        this.brand = brand;
    }
}
//public void displayBrand(){
//    System.out.println("Brand : " + brand);

class Bike extends Vehicle{
    String model;
    Bike(String brand, String model){
        super(brand);
        this.model = model;
    }
    public void display(){
        System.out.println("Brand:" + brand);
        System.out.println("Model: " + model);
    }
}