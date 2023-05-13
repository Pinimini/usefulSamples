package org.example.structural.bridge.paymentsystem;

public class MasterCardPS implements PaymentSystem {
    @Override
    public void printName() {
        System.out.println("MasterCardPS");
    }
}
