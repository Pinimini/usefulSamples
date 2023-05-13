package org.example.structural.bridge.paymentsystem;

public class DebitCard extends Card {

    public DebitCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("Debit card\n");
    }
}
