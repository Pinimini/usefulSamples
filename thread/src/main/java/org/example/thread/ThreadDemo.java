package org.example.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadDemo {

    public static void main(String[] args) {

        case1();
        //case2();
    }

    private static void case1() {
        log.info("{}. Main program started", Thread.currentThread().getName());
        var thread = new Thread(() -> {
            Thread.currentThread().setName("MyThread");
            log.info("from thread:{}", Thread.currentThread().getName());
        });
        thread.start();

        log.info("{}. Main program finished", Thread.currentThread().getName());
    }

    private static void case2() {
        log.info("{}. Main program started", Thread.currentThread().getName());

        var thread = new CustomThread();
        thread.start();

        log.info("{}. Main program finished", Thread.currentThread().getName());
    }

    private static class CustomThread extends Thread {
        @Override
        public void run() {
            log.info("from thread: {}", Thread.currentThread().getName());
        }
    }
}
