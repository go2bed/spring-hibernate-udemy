package com.epam.java.spring;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Andrey_Chadov on 9/26/2017.
 */
public class RandomFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return getRandomFortune();
    }

    private String getRandomFortune(){
        int rand = ThreadLocalRandom.current().nextInt(0, 2);
        String[] fortunes = new String[]{"Random Fortune 1", "Random Fortune 2", "Random Fortune 3"};
        return fortunes[rand];
    }
}
