package com.epam.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //read spring file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class
                );

        //get the bean from the spring container
        Coach theCoach =  context.getBean("swimCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
