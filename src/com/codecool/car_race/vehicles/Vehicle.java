package com.codecool.car_race.vehicles;


import com.codecool.car_race.Race;

public abstract class Vehicle {

    String name;
    int distanceTraveled = 0;
    int normalSpeed;

    public void moveForAnHour() {
        distanceTraveled += normalSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public String getName() {
        return this.name;
    }

    public abstract int prepareForLap(Race race);

    public abstract String getType();

}