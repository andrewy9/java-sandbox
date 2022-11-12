package com.andrew.javasandbox;

import java.util.ArrayList;

public class Dog {
    private String name;
    private Integer age;

    private static Dog OLD_DOG = new Dog("grandpaDog", 99);

    public Dog(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public Dog(){
        this.name = "blank";
        this.age = 1;
    }


    public static Dog oldDog() {
        return OLD_DOG;
    }

    public void happyDogBirthday() {
        this.age ++;
    }

    public void bark () {
        System.out.println("My name is " + this.name + " and I am " + age + "years old");
    }

    public  <T> ArrayList<T> typedBark(T sound) {
        ArrayList<T> listValue = new ArrayList<>();
        listValue.add(sound);
        return listValue;
    }
}
