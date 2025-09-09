package ru.simple.livecoding.order.service;

public class PayPalPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("pay PayPal");
    }
}
