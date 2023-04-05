package com.example.spring.framework.DependencyInjection.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleApp {

    public static void main(String[] args) {

        //bean-component.xml needs to be inside src/main/resources
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-autowired.xml");

        // "car" is passed to getBean to find bean id from xml file
        Vehicle v = (Vehicle) context.getBean("bike");
        v.run();
        System.out.println(v);
    }
}
