package com.example.spring.framework.DependencyInjection.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Data is used for generating POJO (getters, setters, toString etc)

public class Car implements Vehicle {

    private Integer numberOfTyres;
    private String name;

    @Autowired
    private Tyre tyre;

    public Car(int numberOfTyres, String name, Tyre tyre) {
        this.numberOfTyres = numberOfTyres;
        this.name = name;
        this.tyre = tyre;
    }

    public void run(){
        System.out.println("Car component is running. " +tyre);
    };


    @Override
    public String toString() {
        return "Car{" +
                "numberOfTyres=" + numberOfTyres +
                ", name='" + name + '\'' +
                ", tyre=" + tyre +
                '}';
    }
}
