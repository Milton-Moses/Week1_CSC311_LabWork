package org.example;

public class Car extends Vehicle {
    private String brand;

    public Car() {

    }

    public Car(String brand, int numberOfWheels, String color, float engineSize, String fuelType){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void honk() {
        System.out.println("Honk, honk!");
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.getBrand() + "\n" + "Number of Wheels: " + this.getNumberOfWheels() + "\n" + "Color: " +
                this.getColor() + "\n" + "Engine Size: " + this.getEngineSize() + "\n" + "Fuel Size: " +
                this.getFuelType());
    }
}
