package com.example.spring.framework.DependencyInjection.configuration;

import org.springframework.stereotype.Component;

public class Tyre {

    private String brand;

    public Tyre(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
