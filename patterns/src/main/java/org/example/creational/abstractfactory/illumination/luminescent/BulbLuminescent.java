package org.example.creational.abstractfactory.illumination.luminescent;

import org.example.creational.abstractfactory.illumination.Bulb;

public class BulbLuminescent implements Bulb {
  @Override
  public void light() {
    System.out.println("Luminescent light");
  }
}
