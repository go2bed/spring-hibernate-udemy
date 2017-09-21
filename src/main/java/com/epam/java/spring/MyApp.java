package com.epam.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class MyApp {

    public static void main(String[] args) {

        //load spring confg file
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        //retrieve bean from spring container
        Coach baseBallCoach = applicationContext.getBean("myCricketCoach", Coach.class);

        //call methods
        System.out.println(baseBallCoach.getDailyWorkout());

        //call methods for fortunes
        System.out.println(baseBallCoach.getDailyFortune());

        //close context
        applicationContext.close();
    }
}
