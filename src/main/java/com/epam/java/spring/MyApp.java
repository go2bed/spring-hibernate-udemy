package com.epam.java.spring;

/**
 * @author Andrey_Chadov on 9/20/2017.
 */
public class MyApp {

    public static void main(String[] args) {
        //create the object
        Coach theCoach = new TrackCoach();
        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
