package org.example.behavioral.observer;

public class ConsumerA implements Listener {
    @Override
    public void onUpdate(String message) {
        System.out.println("ConsumerA receiving message from producer: " + message);
    }
}
