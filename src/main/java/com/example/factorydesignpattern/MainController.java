package com.example.factorydesignpattern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Created by Iabur on January 04, 2022. */
@RestController
public class MainController {

  @GetMapping("/")
  public String index() {
      int wheels = 2;
      Vehicle car = VehicleFactory.getInstance(wheels);
      return car.getWheel(wheels);
  }
}
