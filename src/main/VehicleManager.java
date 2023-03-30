package main;

import java.util.ArrayList;
import java.util.Scanner;

public interface VehicleManager {

    Vehicle addVehicle();

    Vehicle addVehicle(Scanner scanner);

    void searchVehicle();

    void printAllVehicle();

    default void printAllVehicle(ArrayList<Vehicle> vehicles) {

    }

    void removeVehicle();

}
