package org.example.structural.bridge.paymentsystem;

public class CreditCard extends Card {

    public CreditCard(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    protected void cardType() {
        System.out.println("Credit card\n");
    }
}
