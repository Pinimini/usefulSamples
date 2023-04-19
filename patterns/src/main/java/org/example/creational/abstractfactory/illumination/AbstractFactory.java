package org.example.creational.abstractfactory.illumination;

public interface AbstractFactory {
  Bulb createBulb();

  Lampholder createLampholder();
}
