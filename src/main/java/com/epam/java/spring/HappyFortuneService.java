package com.epam.java.spring;

import org.springframework.stereotype.Component;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is yur lucky day!";
    }
}
