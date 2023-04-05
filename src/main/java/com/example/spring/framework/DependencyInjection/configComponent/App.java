package com.example.spring.framework.DependencyInjection.configComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        ApplePhone ap = factory.getBean(ApplePhone.class);
        ap.details();
    }
}
