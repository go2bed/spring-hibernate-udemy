package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class BaseBallCoach implements Coach{

    //Define a private field for dependency
    private  FortuneService fortuneService;

    //Define a constructor for dependency injection
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }



}
