package services;

import models.films.FunctionalInterface;

import java.util.Random;

public class LambdaService {
    public String name;

    public LambdaService(String name) {
        this.name = name;
    }

    public void capitaliseName(FunctionalInterface functionalInterface) {
        name = functionalInterface.toUpperCase(name);
    }

    public void roll(Integer num) {
        Random randI = new Random();
        int myRandInt = randI.nextInt(num);
        myRandInt = myRandInt+1;
        System.out.println("Random number between 1 and 100: "+myRandInt);
    }
}
