package ru.simple.livecoding.order.service;

public class OrderProcessor<T extends PaymentService> {
    private final InventoryService inventoryService;
    private final PaymentService paymentService;
    private final Class<? extends PaymentService> delegate;

    public OrderProcessor(InventoryService inventoryService, PaymentService paymentService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.delegate = PayPalPaymentService.class;
    }

    public void process() {
        System.out.println("starting process order");
        inventoryService.check();

        paymentService.pay();
        System.out.println("Ending process order");
    }

    <T extends PaymentService> void createService(Class<T> serviceClass) throws Exception {
         serviceClass.getDeclaredConstructor().newInstance(); // Возвращает T
    }
}
