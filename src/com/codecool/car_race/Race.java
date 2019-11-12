package com.codecool.car_race;


import com.codecool.car_race.vehicles.Vehicle;

import java.util.List;


public class Race {

    public static RandomUtils util = new RandomUtils();
    Weather weather = new Weather();

    private boolean isRaining;
    private boolean isThereABrokenTruck;

    public Race() {
        this.isRaining = weather.isRaining();
        this.isThereABrokenTruck = false;
    }

    void simulateRace(List<Vehicle> vehicles) {

        for (int i = 0; i < 50; i++) {
            this.isRaining = weather.isRaining();
            for (Vehicle vehicle : vehicles) {
                vehicle.prepareForLap(this);
            }
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour();
            }
        }

    }

    void printRaceResults(List<Vehicle> vehicles) {

        for (Vehicle vehicle : vehicles) {
            System.out.println("Name: " + vehicle.getName() +
                    " Distance: " + vehicle.getDistanceTraveled() +
                    " Type: " + vehicle.getType());
        }

    }

    public boolean getIsRaining() {
        return isRaining;
    }

    public boolean getIsThereABrokenTruck() {
        return isThereABrokenTruck;
    }

    public void setIsThereABrokenTruck() {
        isThereABrokenTruck = !isThereABrokenTruck;
    }

}

