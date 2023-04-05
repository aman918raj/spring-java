package com.example.spring.framework.DependencyInjection.configComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ApplePhone {

    @Autowired
    @Qualifier("applea16Bionic")
    private MobileProcessor processor;

    public MobileProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(MobileProcessor processor) {
        this.processor = processor;
    }

    public void details(){
        System.out.println("8GB Ram and 64GB Storage");
        this.processor.processor();
    }
}
