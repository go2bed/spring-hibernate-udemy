package com.epam.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        Coach theCoach =  context.getBean("ragbyCoach", Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close context
        context.close();
    }
}
