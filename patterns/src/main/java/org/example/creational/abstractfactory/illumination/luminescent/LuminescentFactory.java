package org.example.creational.abstractfactory.illumination.luminescent;

import org.example.creational.abstractfactory.illumination.AbstractFactory;
import org.example.creational.abstractfactory.illumination.Bulb;
import org.example.creational.abstractfactory.illumination.Lampholder;

public class LuminescentFactory implements AbstractFactory {
  @Override
  public Bulb createBulb() {
    return new BulbLuminescent();
  }

  @Override
  public Lampholder createLampholder() {
    return new LampholderLuminescent();
  }
}
