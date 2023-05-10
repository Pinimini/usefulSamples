package org.example.behavioral.strategy;

public class Bus implements Strategy {
    @Override
    public void transportation() {
        System.out.println("Доехать на автобусе");
    }
}
