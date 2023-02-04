package services;

import models.films.FunctionalInterface;

public class LambdaService {
    public String name;

    public LambdaService(String name) {
        this.name = name;
    }

    public void capitaliseName(FunctionalInterface functionalInterface) {
        name = functionalInterface.toUpperCase(name);
    }
}
