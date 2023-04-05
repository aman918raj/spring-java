package com.example.spring.framework.DependencyInjection.constructorInjection;

public class Car implements Vehicle {

    private Integer numberOfTyres;
    private String name;

    public Car(int numberOfTyres, String name) {
        super();
        this.numberOfTyres = numberOfTyres;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTyres=" + numberOfTyres +
                ", name='" + name + '\'' +
                '}';
    }

    public void run(){
        System.out.println("Car constructor is running");
    };



}
