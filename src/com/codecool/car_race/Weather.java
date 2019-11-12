package com.codecool.car_race;


import static com.codecool.car_race.Race.util;

public class Weather {

    private boolean isRaining;
    double PROBABILITY_OF_RAIN = 0.3;

    public void setRaining() {
        isRaining = util.getRandomBooleanWithProbability(PROBABILITY_OF_RAIN);
    }

    public boolean isRaining() {
        setRaining();
        return isRaining;
    }

}
