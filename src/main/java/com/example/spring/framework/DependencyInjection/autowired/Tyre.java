package com.example.spring.framework.DependencyInjection.autowired;

import lombok.Data;

//@Data is used for generating POJO (getters, setters, toString etc)
@Data
public class Tyre {

    private String brand;

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
