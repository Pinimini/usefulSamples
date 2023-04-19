package org.example.creational.abstractfactory.illumination.led;

import org.example.creational.abstractfactory.illumination.Lampholder;

public class LampholderLed implements Lampholder {
  @Override
  public void hold() {
    System.out.println("Led hold");
  }
}
