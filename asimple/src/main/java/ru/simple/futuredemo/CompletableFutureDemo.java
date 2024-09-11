package ru.simple.futuredemo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class CompletableFutureDemo {

    public static void main(String[] args) throws InterruptedException {
        // Вызов метода для вычисления факториала асинхронно
        CompletableFuture<Long> futureFactorial = calculateFactorialAsync(5);

        // Добавляем обработчик, который будет выполнен, когда задача завершится
        futureFactorial.thenAccept(result -> {
            log.info("Факториал: {}", result);
        });

        // Выполняем другие операции, пока факториал вычисляется
        log.info("Выполняются другие операции...");
        TimeUnit.SECONDS.sleep(5);
        // Ждем завершения задачи (необязательно, если вы не хотите блокировать основной поток)
        futureFactorial.join();
        log.info("Выполняются другие операции...");
    }

    // Метод для вычисления факториала асинхронно
    public static CompletableFuture<Long> calculateFactorialAsync(int number) {
        return CompletableFuture.supplyAsync(() -> {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
                // Имитация длительной работы
                try {
                    Thread.sleep(100); // Задержка для имитации длительной операции
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Восстанавливаем состояние прерывания
                }
            }
            return factorial; // Возвращаем результат
        });

    }
}
