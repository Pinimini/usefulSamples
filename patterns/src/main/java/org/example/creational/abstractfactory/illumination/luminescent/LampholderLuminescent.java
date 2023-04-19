package org.example.creational.abstractfactory.illumination.luminescent;

import org.example.creational.abstractfactory.illumination.Lampholder;

public class LampholderLuminescent implements Lampholder {
  @Override
  public void hold() {
    System.out.println("Luminescent hold");
  }
}
