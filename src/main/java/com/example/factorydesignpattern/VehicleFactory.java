package com.example.factorydesignpattern;

import org.springframework.stereotype.Component;

/**
 * Created by Iabur on January 04, 2022.
 */
@Component
public class VehicleFactory {
    public static Vehicle getInstance(int wheels) {
        if(wheels == 4) {
            return ApplicationContextHolder.getContext().getBean(Car.class);
        } else if(wheels == 2) {
            return ApplicationContextHolder.getContext().getBean(Bike.class);
        }

        return null;
    }
}
