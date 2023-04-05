package com.example.spring.framework.DependencyInjection.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("#{new java.lang.Integer('${CarTyre}')}")
    private Integer numTyres;

    @Value("#{new java.lang.String('${CarName}')}")
    private String name;

    @Value("#{new java.lang.Integer('${BikeTyre}')}")
    private Integer bnumTyres;

    @Value("#{new java.lang.String('${BikeName}')}")
    private String bname;

    @Value("#{new java.lang.String('${TyreBrand}')}")
    private String tyreBrand;

    @Bean
    public Tyre getTyre(@Value("#{new java.lang.String('${TyreBrand}')}") String tyreBrand){
        return new Tyre(tyreBrand);
    }

    @Bean
    public Vehicle getCar(@Value("#{new java.lang.Integer('${CarTyre}')}") int numTyres, @Value("#{new java.lang.String('${CarName}')}") String name, Tyre tyre){
        return new Car(numTyres, name, tyre);
    }

    @Bean
    public Vehicle getBike(@Value("#{new java.lang.Integer('${BikeTyre}')}") int numTyres, @Value("#{new java.lang.String('${BikeName}')}") String name, Tyre tyre){
        return new Bike(numTyres, name, tyre);
    }
}
