package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManagerImpl implements VehicleManager{

//    VehicleManagerImpl must implement vehiclemanager
    // add vehicle list, geters and seters


//    get method in main class with VehicleManager manager = Vehicle.addVehicle (search, remove...)

//    ArrayList<Vehicle> vehicleArrayList; ??????

    @Override
    public Vehicle addVehicle(Scanner scanner) {
        return VehicleManager.super.addVehicle(scanner);
    }

    @Override
    public void searchVehicle() {
        VehicleManager.super.searchVehicle();
    }

    @Override
    public void printAllVehicle() {

    }

    @Override
    public void removeVehicle() {

    }
}
