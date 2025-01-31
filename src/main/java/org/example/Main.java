package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Initial:\n");
        Car Buick = new Car("Buick", 4, "Blue", 200.03F, "Diesel" );
        System.out.println(Buick.getBrand());
        System.out.println(Buick.getNumberOfWheels());
        System.out.println(Buick.getColor());
        System.out.println(Buick.getEngineSize());
        System.out.println(Buick.getFuelType());

        System.out.println("\nRevised:");
        Buick.setColor("Red");
        Buick.setFuelType("Gasoline");
        Buick.setNumberOfWheels(6);
        Buick.setEngineSize(400.02F);
        Buick.setBrand("Quick");
        Buick.displayInfo();

        Vehicle Truck = new Vehicle( 4, "White", 600.03F, "Diesel");
        System.out.println("\nInitial:");
        System.out.println(Truck.getNumberOfWheels());
        System.out.println(Truck.getColor());
        System.out.println(Truck.getEngineSize());
        System.out.println(Truck.getFuelType());

        System.out.println("\nRevised:");
        Truck.setColor("Red");
        Truck.setFuelType("Gasoline");
        Truck.setNumberOfWheels(6);
        Truck.setEngineSize(400.02F);
        System.out.println(Truck.getNumberOfWheels());
        System.out.println(Truck.getColor());
        System.out.println(Truck.getEngineSize());
        System.out.println(Truck.getFuelType());

    }
}