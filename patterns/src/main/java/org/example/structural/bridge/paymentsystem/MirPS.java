package org.example.structural.bridge.paymentsystem;

public class MirPS implements PaymentSystem {
    @Override
    public void printName() {
        System.out.println("MirPS");
    }
}
