package org.example.behavioral.strategy;

public class Car implements Strategy {
    @Override
    public void transportation() {
        System.out.println("Доехать на автомобиле");
    }
}
