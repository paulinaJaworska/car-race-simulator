package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.RandomUtils;


public class Motorcycle extends Vehicle {

    RandomUtils util = new RandomUtils();

    private static int motorcycleNumber = 0;

    public Motorcycle(Race race) {
        motorcycleNumber += 1;  // czy jest inny sposób liczenia powstałych instancji obiektu?

        this.name = "Motorcycle " + motorcycleNumber;
        this.normalSpeed = prepareForLap(race);
    }

    @Override
    public int prepareForLap(Race race) {
        normalSpeed = 100;

        if (race.getIsRaining()) {
            normalSpeed = normalSpeed - util.getRandomIntInRange(5, 50);
        }
        return normalSpeed;
    }

    @Override
    public String getType() {
        return "Motorcycle";
    }

}


