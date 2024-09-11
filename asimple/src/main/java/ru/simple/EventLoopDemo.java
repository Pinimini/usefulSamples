package ru.simple;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class EventLoopDemo {
    private final BlockingQueue<Runnable> eventQueue = new LinkedBlockingQueue<>();
    private volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        EventLoopDemo eventLoop = new EventLoopDemo();
        eventLoop.start();

        // Добавляем события в Event Loop
        eventLoop.postEvent(() -> System.out.println("Событие 1 выполнено"));
        eventLoop.postEvent(() -> System.out.println("Событие 2 выполнено"));
        eventLoop.postEvent(() -> System.out.println("Событие 3 выполнено"));

        // Останавливаем Event Loop через несколько секунд
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        eventLoop.stop();
        eventLoop.postEvent(() -> System.out.println("Событие 4 выполнено"));
    }

    public void start() {
        Thread eventLoopThread = new Thread(() -> {
           while (running) {
               System.out.println("Поток EventLoop, running =" + running);
               try {
                   Runnable event = eventQueue.take();
                   event.run();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        eventLoopThread.setDaemon(true);
        eventLoopThread.start();
    }

    public void stop() {
        running = false;
    }

    public void postEvent(Runnable event) {
        eventQueue.offer(event);
    }
}
