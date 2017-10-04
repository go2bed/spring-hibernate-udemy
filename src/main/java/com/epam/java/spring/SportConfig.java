package com.epam.java.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */
@Configuration
@ComponentScan("com.epam.java.spring")
@PropertySource("classpath:app.properties")
public class SportConfig {


    @Bean
    public  FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
