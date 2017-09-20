package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
