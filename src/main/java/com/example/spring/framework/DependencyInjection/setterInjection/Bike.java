package com.example.spring.framework.DependencyInjection.setterInjection;

import lombok.Data;

//@Data is used for generating POJO (getters, setters, toString etc)
@Data
public class Bike implements Vehicle{

    private int numberOfTyres;
    private String name;

    public void run() {
        System.out.println("Bike setter is running");
    }

}
