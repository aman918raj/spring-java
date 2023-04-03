package com.example.spring.framework.DependencyInjection.xml;

import lombok.Data;

//@Data is used for generating POJO (getters, setters, toString etc)
@Data
public class Bike implements Vehicle {

    private int numberOfTyres;
    private String name;

    public void run() {
        System.out.println("Bike is running");
    }

}
