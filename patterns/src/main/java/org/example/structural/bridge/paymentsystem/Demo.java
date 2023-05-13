package org.example.structural.bridge.paymentsystem;

public class Demo {
    public static void main(String[] args) {
        Card card1 = new CreditCard(new VisaPS());
        card1.info();

        Card card2 = new DebitCard(new MasterCardPS());
        card2.info();

        Card card3 = new DebitCard(new MirPS());
        card3.info();

    }
}
