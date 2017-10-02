package com.epam.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        //get the bean from the spring container
        Coach theCoach =  context.getBean("tennisCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
