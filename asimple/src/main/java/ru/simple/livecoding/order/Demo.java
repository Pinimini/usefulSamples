package ru.simple.livecoding.order;

import ru.simple.livecoding.order.service.*;

public class Demo {

/*    Задача:
У вас есть класс OrderProcessor, который обрабатывает заказы, взаимодействуя с платежной системой (PaymentService) и проверяя наличие товара(InventoryService).

## Требования:

### [Чистота: Система должна позволять легко добавлять новые платежные системы (например, PayPal, криптовалюту)] без изменения кода OrderProcessor.
**Тестируемость:** Должна быть возможность тестировать OrderProcessor в изоляции от реальных сервисов.
**Масштабируемость:** Код должен следовать SOLID, избегая жесткой связанности.

### Задание:

#### Спроектируйте интерфейсы и классы (Java).
Предусмотрите внедрение зависимостей (DI).
Объясните, как можно добавить ленивую инициализацию PaymentService (например, если его создание – тяжелая операция).*/

    public static void main(String[] args) {
        InventoryService service = new InventoryService();
        PaymentService paymentService = new PayPalPaymentService();

        LazyPaymentServiceProxy proxy = new LazyPaymentServiceProxy(PayPalPaymentService::new);

        OrderProcessor orderProcessor = new OrderProcessor(service, proxy);

        orderProcessor.process();
    }

}




