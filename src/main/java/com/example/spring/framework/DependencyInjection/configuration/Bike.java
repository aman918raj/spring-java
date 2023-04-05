package com.example.spring.framework.DependencyInjection.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Bike implements Vehicle {

    private int numberOfTyres;
    private String name;

    @Autowired
    private Tyre tyre;

    public Bike(int numberOfTyres, String name, Tyre tyre) {
        this.numberOfTyres = numberOfTyres;
        this.name = name;
        this.tyre = tyre;
    }

    public void run() {
        System.out.println("Bike component is running. "+ tyre);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "numberOfTyres=" + numberOfTyres +
                ", name='" + name + '\'' +
                ", tyre=" + tyre +
                '}';
    }
}
