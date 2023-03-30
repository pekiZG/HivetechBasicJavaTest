package main;

import java.util.Scanner;

public class Car extends Vehicle implements VehicleManager {

    private String doorNumber;

    private String bodyType;

    public Car(String brand, String model, String productionYear, String vin, String color, String fuelType, String doorNumber, String bodyType) {
        super(brand, model, productionYear, vin, color, fuelType);
        this.doorNumber = doorNumber;
        this.bodyType = bodyType;
    }

    public Car() {
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }


    @Override
    public Vehicle addVehicle(Scanner scanner) {
        Car car = new Car();
        System.out.print("Enter car brand: ");
        String brand = scanner.next();
        car.setBrand(brand);

        System.out.print("Enter car model: ");
        String model = scanner.next();
        car.setModel(model);

        System.out.print("Enter car year: ");
        String productionYear = scanner.next();
        car.setProductionYear(productionYear);

        System.out.print("Enter car VIN: ");
        String vin = scanner.next();
        car.setVin(vin);

        System.out.print("Enter car color: ");
        String color = scanner.next();
        car.setColor(color);

        System.out.print("Enter car fuel type: ");
        String fuelType = scanner.next();
        car.setFuelType(fuelType);

        System.out.print("Enter car number of doors: ");
        String doorNumber = scanner.next();
        car.setDoorNumber(doorNumber);

        System.out.print("Enter car body type: ");
        String bodyType = scanner.next();
        car.setBodyType(bodyType);

        return car;
    }

    @Override
    public void searchVehicle() {

    }

    @Override
    public void printAllVehicle() {

    }

    @Override
    public void removeVehicle() {

    }
}
