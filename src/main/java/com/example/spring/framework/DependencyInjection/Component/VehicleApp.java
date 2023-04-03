package com.example.spring.framework.DependencyInjection.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleApp {

    public static void main(String[] args) {

        //bean.xml needs to be inside src/main/resources
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // "car" is passed to getBean to find bean id from xml file
        Vehicle v = (Vehicle) context.getBean("bike");
        v.run();
        System.out.println(v);
    }
}
