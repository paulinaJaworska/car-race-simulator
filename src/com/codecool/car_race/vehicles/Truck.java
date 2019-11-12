package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

import static com.codecool.car_race.Race.util;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft;  // how long is broken (2 turns)
    private boolean isThereABrokenTruck;

    public Truck(Race race) {

        this.name = String.valueOf(util.getRandomIntInRange(0, 1001));
        this.isThereABrokenTruck = util.getRandomBooleanWithProbability(0.05);
        this.normalSpeed = prepareForLap(race);
        this.breakdownTurnsLeft = 2;
    }
    private boolean checkIfTruckBroken(Race race) {
        if (this.isThereABrokenTruck && this.breakdownTurnsLeft > 0 ) {
            race.setIsThereABrokenTruck();
            this.breakdownTurnsLeft --;
            return true;
        } else {
            this.isThereABrokenTruck = util.getRandomBooleanWithProbability(0.05);
            race.setIsThereABrokenTruck();
            this.breakdownTurnsLeft = 2;
            return false;
        }
    }

    @Override
    public int prepareForLap(Race race) {
        this.normalSpeed = 100;
        if (checkIfTruckBroken(race)) {
            this.normalSpeed = 0;
        }
        return this.normalSpeed;
    }

    @Override
    public String getType() {
        return "Truck";
    }

}