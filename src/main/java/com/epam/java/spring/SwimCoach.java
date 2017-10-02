package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim workout for the coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
