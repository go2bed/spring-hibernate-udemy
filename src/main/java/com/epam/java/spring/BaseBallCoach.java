package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class BaseBallCoach implements Coach{

    private  FortuneService fortuneService;

    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }



}
