package main;

import java.util.Scanner;

public interface VehicleManager {

    default Vehicle addVehicle(Scanner scanner) {
        Vehicle vehicle = null;
        return vehicle;
    }

    default void searchVehicle() {

    }

    void printAllVehicle();

    void removeVehicle();

}
