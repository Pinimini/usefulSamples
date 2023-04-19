package org.example.creational.abstractfactory.illumination.led;

import org.example.creational.abstractfactory.illumination.Bulb;

public class BulbLed implements Bulb {
  @Override
  public void light() {
    System.out.println("Led light");
  }
}
