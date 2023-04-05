package com.example.spring.framework.DependencyInjection.configComponent;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("applea16Bionic")
/*
here we have defined component name but by default component the name will be the
same as name of the class but without qualifier and first letter lowercase
for ex if we have class name as MobileName then default component name will be mobileName
*/

//@Primary //@Primary annotation select primary class if an Interface has multiple implementations
public class AppleA16Bionic implements MobileProcessor{

    public void processor(){
        System.out.println("This is Apple A16 Bionic processor");
    }
}
