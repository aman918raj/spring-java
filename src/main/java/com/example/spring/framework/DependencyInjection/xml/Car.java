package com.example.spring.framework.DependencyInjection.xml;

import lombok.Data;
import org.springframework.stereotype.Component;

//@Data is used for generating POJO (getters, setters, toString etc)
@Data
public class Car implements Vehicle {

    private int numberOfTyres;
    private String name;

    public void run(){
        System.out.println("Car is running");
    };

}
