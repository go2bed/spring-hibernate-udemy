package com.epam.java.spring;

import org.springframework.stereotype.Component;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
@Component
public class RagbyCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Tried to workout all day long";
    }

    @Override
    public String getDailyFortune() {
        return "";
    }
}
