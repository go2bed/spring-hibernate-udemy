package com.epam.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        //load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        //retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //check if they are the same object
        boolean result = theCoach == alphaCoach;

        //print out the results
        System.out.println("Pointing to the same object :" + result);

        System.out.println("memory location for theCoach: " + theCoach);

        System.out.println("memory location for alphaCoach: " + alphaCoach);

        context.close();

    }
}
