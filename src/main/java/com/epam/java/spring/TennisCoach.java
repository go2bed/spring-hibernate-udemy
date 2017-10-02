package com.epam.java.spring;

import org.springframework.stereotype.Component;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

}
