package org.example.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class JoinDemo {
    private static final Logger logger = LoggerFactory.getLogger(JoinDemo.class);

    public static void main(String[] args) throws InterruptedException {
//        freeRun();
        orderedRun();
    }


    private static Thread createThread(String val) {
         Runnable runnable = () -> action(val);
        return new Thread(runnable);
    }

    private static void freeRun() throws InterruptedException {
        logger.info("starting");

        var t1 = createThread("t1");
        var t2 = createThread("t2");
        var t3 = createThread("t3");
        var t4 = createThread("t4");
        var t5 = createThread("t5");
        var t6 = createThread("t6");
        var t7 = createThread("t7");
        var t8 = createThread("t8");
        var t9 = createThread("t9");
        var t10 = createThread("t10");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        t5.join();

        logger.info("finished");
    }

    private static void orderedRun() throws InterruptedException {
        logger.info("starting");

        var t1 = createThread("t1");
        var t2 = createThread("t2");


        t1.start();
        t1.join();
        t2.start();
        t2.join();

        logger.info("finished");
    }


    private static void action(String str) {
        for (int i = 1; i <= 10; i++) {
            logger.info("number: {}", i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        logger.info(String.format("%s finished", str));
    }
}
