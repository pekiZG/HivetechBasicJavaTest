package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selection;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        VehicleManagerImpl vehicleManagerImpl = new VehicleManagerImpl();


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
                        Vehicle newCar = vehicleManagerImpl.addVehicle(scanner);
                        vehicles.add(newCar);
                        break;
                    } else if (choice.equals("truck")) {
                        Vehicle newTruck = vehicleManagerImpl.addVehicle(scanner);
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
                        vehicleManagerImpl.printAllVehicle(vehicles);
                        break;
                    }
                }
                case 4: {
                    System.out.println("Delete vehicle");
                    System.out.println("Enter VIN of vehicle to delete: ");

                    String vinNumberToDelete = scanner.nextLine();

                    for (Vehicle oneVehicle : vehicles) {
                        String getVinNmbr = oneVehicle.getVin();
                        if (vinNumberToDelete.isEmpty()) {
                            System.out.println("There is no VIN number. Try again.");
                        } else if (vinNumberToDelete == getVinNmbr) {
                            int index = vehicles.indexOf(oneVehicle);
                            vehicles.remove(index);
                            // nes sere

                            //ovo radi
//                            vehicles.removeIf(t -> t.getVin().equals(vinNumberToDelete));
                            System.out.println("Vehicle with VIN " + getVinNmbr + " deleted successfully.");
                        } else {
                            System.out.println("There is no such vehicle. Try again");
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Goodbye");
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