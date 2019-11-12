package com.codecool.car_race;


import java.util.Random;

public class RandomUtils {
    private Random random = new Random();

    public String setRandomCarName(String[] car_names) {
        int firstRandomIndex = random.nextInt(car_names.length);
        int secondRandomIndex = random.nextInt(car_names.length);
        return car_names[firstRandomIndex] + " " + car_names[secondRandomIndex];
    }

    public int getRandomIntInRange(int start, int stop) {
        return random.nextInt((stop + 1) - start) + start;

    }

    public boolean getRandomBooleanWithProbability(Double probability) {
        return random.nextInt() <= probability;
    }

}
