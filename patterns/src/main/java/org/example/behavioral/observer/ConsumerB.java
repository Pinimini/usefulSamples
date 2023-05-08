package org.example.behavioral.observer;

public class ConsumerB {

    private static final Listener listener = data -> System.out.println("ConsumerB receiving message from producer: " + data);

    public Listener getListener() {
        return listener;
    }
}
