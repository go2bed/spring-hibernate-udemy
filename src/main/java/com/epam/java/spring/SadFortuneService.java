package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day :( ";
    }
}
