package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

import static com.codecool.car_race.Race.util;


public class Car extends Vehicle {

    private String[] CAR_NAMES_ELEMENTS = {"Aura", "Eos", "Vanish", "Behemoth", "Ranger",
            "Mastery", "Presence", "Origin", "Thriller", "Supremacy"};

    public Car(Race race) {
        this.name = util.setRandomCarName(CAR_NAMES_ELEMENTS);
        this.normalSpeed = prepareForLap(race);
    }

    @Override
    public int prepareForLap(Race race) {
        this.normalSpeed = util.getRandomIntInRange(70, 110);
        if (race.getIsThereABrokenTruck()) {
            if (this.normalSpeed > 75) {
                this.normalSpeed = 75;
            }
        }
        return normalSpeed;
    }

    @Override
    public String getType() {
        return "Car";
    }

}
