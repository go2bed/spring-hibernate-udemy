package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
