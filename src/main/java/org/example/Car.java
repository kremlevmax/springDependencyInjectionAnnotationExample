package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

  @Value("${vehicle.make}")
  private String make;
  @Value("${vehicle.year}")
  private int year;

  public Car() {
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  @Override
  public int getYear() {
    return year;
  }

  @Override
  public void setYear(int year) {
    this.year = year;
  }

  public String getVehicleType() {
    return "Car";
  }
}
