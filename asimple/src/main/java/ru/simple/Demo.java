package ru.simple;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("start");
        CompletableFuture<List<Integer>> future = new CompletableFuture<>();

        // Асинхронно возводим в квадрат
        CompletableFuture<List<Integer>> squaredFuture = future.thenApplyAsync(list ->
                list.stream()
                        .map(x -> x * x)
                        .collect(Collectors.toList())
        );

        // Завершаем future (имитируем получение данных)
        future.complete(List.of(1, 2, 3, 4));

        // Ждём результат и выводим (блокирующий вызов для демонстрации)
        List<Integer> result = squaredFuture.join();  // или squaredFuture.join()
        System.out.println(result);  // [1, 4, 9, 16]
    }

    public static void parseIp(List<Integer> ints) {
/*        CompletableFuture<List<Integer>> future = new CompletableFuture<>();
        CompletableFuture<List<Integer>> listCompletableFuture = future.thenApplyAsync(t -> ints.stream().map(i -> i * i).toList());


        future.complete(ints);
        listCompletableFuture.thenAcceptAsync(list -> list.forEach(System.out::println));
        listCompletableFuture.join();*/
        CompletableFuture<List<Integer>> future = new CompletableFuture<>();

// Асинхронно преобразуем список, возводя элементы в квадрат
        CompletableFuture<List<Integer>> squaredFuture = future.thenApplyAsync(list ->
                list.stream()
                        .map(x -> x * x)  // Возводим в квадрат
                        .collect(Collectors.toList())
        );

// Пример завершения future (если нужно)
        future.complete(List.of(1, 2, 3, 4));
        List<Integer> join = future.join();
// Получаем результат (асинхронно)
        System.out.println(join);
    }
}
