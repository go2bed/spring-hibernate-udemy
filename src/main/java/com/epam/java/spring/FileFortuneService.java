package com.epam.java.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

/**
 * @author Andrey_Chadov on 10/2/2017.
 */

@Component
public class FileFortuneService implements FortuneService {

    private List<String> data;

    @PostConstruct
    public void readTheFile() {
        System.out.println("We are in post construct  method readTheFile() ");
        data = getDataFromFile();
    }


    //create a random number generator
    private Random random = new Random();


    @Override
    public String getFortune() {
        return data.get(random.nextInt(data.size()));
    }


    private List<String> getDataFromFile() {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(
                    Paths.get("D:\\LEARN_PROJECTS\\SPRING\\spring-demo-one\\src\\main\\resources\\fortunes.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
