package com.epam.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
public class BeanScopeDemoApp {

    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-bean-scope.xml");


        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);


        //check if they are the same
        boolean result = (theCoach == alphaCoach);

        //print out the results
        System.out.println("Pointing to the same object "+ result);

        System.out.println("Memory location gor the theCoach: " + theCoach);

        System.out.println("Memory location gor the alphaCoach: " + alphaCoach);

        //close context
        context.close();
    }
}
