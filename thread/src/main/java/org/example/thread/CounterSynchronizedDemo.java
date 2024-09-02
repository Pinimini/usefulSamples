package org.example.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CounterSynchronizedDemo {

    private static int counter;
    private static int anotherCounter;

    private static final Logger logger = LoggerFactory.getLogger(CounterSynchronizedDemo.class);

    public static void main(String[] args) {
        freeRun();
    }


    private static Thread createThread() {
        return new Thread(CounterSynchronizedDemo::incrementCounter);
    }

    private static Thread createThread2() {
        return new Thread(CounterSynchronizedDemo::incrementAnotherCounter);
    }

    private static void freeRun() {
        logger.info("starting");

        var t1 = createThread();
        var t2 = createThread2();

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        logger.info("counter = {}", counter);
        logger.info("AnotherCounter = {}", anotherCounter);
    }

    private static void incrementCounter() {
        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }
    }

    private static void incrementAnotherCounter() {
        for (int i = 0; i < 1_000_000; i++) {
            anotherCounter++;
        }
    }
}
