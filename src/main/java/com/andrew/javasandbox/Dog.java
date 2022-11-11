package com.andrew.javasandbox;

public class Dog {
    private String name;
    private Integer age;

    public Dog(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void bark () {
        System.out.println("My name is " + this.name + " and I am " + age + "years old");
    }
}
