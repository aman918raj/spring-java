package com.example.spring.framework.DependencyInjection.constructorInjection;


public class Bike implements Vehicle {

    private int numberOfTyres;
    private String name;

    public Bike(int numberOfTyres, String name) {
        super();
        this.numberOfTyres = numberOfTyres;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numberOfTyres=" + numberOfTyres +
                ", name='" + name + '\'' +
                '}';
    }

    public void run() {
        System.out.println("Bike constructor is running");
    }

}
