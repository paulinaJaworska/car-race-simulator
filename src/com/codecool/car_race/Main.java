package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Race race = new Race();
    private static List<Vehicle> vehicles = new ArrayList<>();

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        String[] vehiclesTypesToRace = {"Car", "Motorcycle", "Truck"};

        for (String vehicle : vehiclesTypesToRace) {
            for (int i = 0; i
                    < 10; i++) {
                if (vehicle.equals("Car")) {
                    vehicles.add(new Car(race));
                } else if (vehicle.equals("Motorcycle")) {
                    vehicles.add(new Motorcycle(race));
                } else {
                    vehicles.add(new Truck(race));
                }
            }
        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {

        createVehicles(race);

        race.simulateRace(vehicles);
        race.printRaceResults(vehicles);
    }
}
