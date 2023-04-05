package com.example.spring.framework.DependencyInjection.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleApp {

    public static void main(String[] args) {

        //Does not require xml
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Vehicle v = factory.getBean(Bike.class);
        v.run();
        System.out.println(v);
    }
}
