package main;

import java.util.Scanner;

public class Truck extends Vehicle {

    private String carryCapacity;

    public Truck(String brand, String model, String productionYear, String vin, String color, String fuelType, String carryCapacity) {
        super(brand, model, productionYear, vin, color, fuelType);
        this.carryCapacity = carryCapacity;
    }

    public Truck(){}

    public String getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(String carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

//    @Override
//    public Vehicle addVehicle(Scanner scanner) {
//        Truck truck = new Truck();
//        System.out.print("Enter truck brand: ");
//        String brand = scanner.next();
//        truck.setBrand(brand);
//
//        System.out.print("Enter truck model: ");
//        String model = scanner.next();
//        truck.setModel(model);
//
//        System.out.print("Enter truck year: ");
//        String productionYear = scanner.next();
//        truck.setProductionYear(productionYear);
//
//        System.out.print("Enter truck VIN: ");
//        String vin = scanner.next();
//        truck.setVin(vin);
//
//        System.out.print("Enter truck color: ");
//        String color = scanner.next();
//        truck.setColor(color);
//
//        System.out.print("Enter truck fuel type: ");
//        String fuelType = scanner.next();
//        truck.setFuelType(fuelType);
//
//        System.out.print("Enter truck carry capacity: ");
//        String carryCapacity = scanner.next();
//        truck.setCarryCapacity(carryCapacity);
//
//        return truck;
//    }


}
