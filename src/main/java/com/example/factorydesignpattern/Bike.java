package com.example.factorydesignpattern;

import org.springframework.stereotype.Component;

/** Created by Iabur on January 04, 2022. */
@Component
public class Bike implements Vehicle {

  @Override
  public String getWheel(int wheel) {
    return "Bike has " + wheel + " wheels";
  }
}
