package com.example.spring.framework.DependencyInjection.configComponent;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor{

    public void processor(){
        System.out.println("This is Snapdragon processor");
    }
}
