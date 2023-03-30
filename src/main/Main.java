package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selection;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        do {
            System.out.println("Vehicle Fleet Management System");
            System.out.println("-------------------------------");
            System.out.println("Select option");
            System.out.println("1. Add a vehicle to the fleet");
            System.out.println("2. Search for vehicles by make or model");
            System.out.println("3. Print all vehicles in the fleet");
            System.out.println("4. Delete a vehicle from the fleet");
            System.out.println("5. Quit");

            selection = scanner.nextInt();
            scanner.nextLine();
            switch (selection) {
                case 1: {
                    System.out.println("Enter 'car' or 'truck': ");
                    String choice = scanner.nextLine();
                    if (choice.equals("car")) {
                        Car car = new Car();
                        Vehicle newCar = car.addVehicle(scanner);
                        vehicles.add(newCar);
                        break;
                    } else if (choice.equals("truck")) {
                        Truck truck = new Truck();
                        Vehicle newTruck = truck.addVehicle(scanner);
                        vehicles.add(newTruck);
                        break;
                    } else {
                        System.out.println("Wrong expression. Try again!");
                        break;
                    }
                }
                case 2: {
                    System.out.println(" Pretrazivanje....");
                    scanner.nextLine();
                    break;
                }
                case 3: {
                    if (vehicles.isEmpty()) {
                        System.out.println("There is no vehicles currently.");
                        break;
                    } else {
                        for (Vehicle oneVehicle : vehicles) {
                            System.out.println(oneVehicle.getBrand() + " " + oneVehicle.getModel());
                        }
                        break;
                    }
                }
                case 4: {
                    System.out.println("Delete vehicle");
                    break;
                }
            }
        } while (selection != 5);

//        Car car1= new Car("Toyota","Yaris","2222","23434","blue", "diesel", "4", "hatchback");
//        Car car2= new Car("BMW","E55","2222","23434","blue", "petrol", "5", "minivan");
//        Car car3= new Car("Skoda","Fabia","2222","23434","blue", "petrol", "4", "limosine");
//        Truck truck = new Truck("Audi","000","2101","23123434","red", "diesel", "4000" );
//
//        vehicles.add(car1);
//        vehicles.add(car2);
//        vehicles.add(car3);
//        vehicles.add(truck);

    }
}