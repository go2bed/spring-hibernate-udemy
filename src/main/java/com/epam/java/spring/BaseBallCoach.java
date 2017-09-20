package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class BaseBallCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }
}
