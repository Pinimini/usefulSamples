package ru.simple.futuredemo;

import lombok.extern.slf4j.Slf4j;
import ru.simple.callbackdemo.Button;
import ru.simple.callbackdemo.ButtonHandler;
import ru.simple.callbackdemo.Handler;

import java.util.concurrent.*;

@Slf4j
public class FutureDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        log.info("Начало работы в main");
        Callable<Integer> task = () -> {
            log.info("Начало работы в Callable");
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
                TimeUnit.SECONDS.sleep(1);
            }
            log.info("Конец работы в Callable");
            return sum;
        };
        Future<Integer> future = executorService.submit(task);

        log.info("Возврат в main");

        try {
            Integer result = future.get(); // Это вызовет блокировку, пока задача не завершится
            System.out.println("Сумма чисел: " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
        log.info("Конец работы в main");
    }
}
