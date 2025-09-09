package ru.simple.livecoding.order.service;

import java.util.function.Supplier;

public class LazyPaymentServiceProxy implements PaymentService {
    private final Supplier<? extends PaymentService> supplier;

    public LazyPaymentServiceProxy(Supplier<? extends PaymentService> supplier) {
        this.supplier = supplier;
    }

    @Override
    public void pay() {
        PaymentHolder.getInstance(supplier);
    }

    private static class PaymentHolder {
        private static PaymentService INSTANCE;

        static PaymentService getInstance(Supplier<? extends PaymentService> supplier) {
            INSTANCE = supplier.get();
            return INSTANCE;
        }

    }

}
