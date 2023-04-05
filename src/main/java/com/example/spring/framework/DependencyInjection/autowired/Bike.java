package com.example.spring.framework.DependencyInjection.autowired;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Data is used for generating POJO (getters, setters, toString etc)
@Component
@Data
public class Bike implements Vehicle {

    private int numberOfTyres;
    private String name;

    @Autowired
    private Tyre tyre;

    public void run() {
        System.out.println("Bike component is running. "+ tyre);
    }

}
