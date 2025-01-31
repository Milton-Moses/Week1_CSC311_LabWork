package org.example;

public class Car extends Vehicle {
    private String brand;

    public Car() {

    }
    //created a parameterized constructor
    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }
    //sets the brand variable
    public void setBrand(String brand){
        this.brand = brand;
    }
    //gets the brand variable
    public String getBrand(){
        return brand;
    }
    //Displays a message that the car is honking when it is called
    public void honk() {
        System.out.println("Honk, honk!");
    }
    //displays info about the car
    public void displayInfo(){
        System.out.println("Brand: " + this.getBrand() + "\n" + "Number of Wheels: " + this.getNumberOfWheels() + "\n" + "Color: " +
                this.getColor() + "\n" + "Engine Size: " + this.getEngineSize() + "\n" + "Fuel Size: " +
                this.getFuelType());
    }
}
