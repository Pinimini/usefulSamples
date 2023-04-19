package org.example.creational.abstractfactory.illumination.led;

import org.example.creational.abstractfactory.illumination.AbstractFactory;
import org.example.creational.abstractfactory.illumination.Bulb;
import org.example.creational.abstractfactory.illumination.Lampholder;

public class LedFactory implements AbstractFactory {
  @Override
  public Bulb createBulb() {
    return new BulbLed();
  }

  @Override
  public Lampholder createLampholder() {
    return new LampholderLed();
  }
}
