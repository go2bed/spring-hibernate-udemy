package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
}
