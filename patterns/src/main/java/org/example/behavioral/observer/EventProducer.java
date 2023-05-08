package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventProducer {

    private final List<Listener> listeners = new ArrayList<>();

    void addListener(Listener listener) {
        listeners.add(listener);
    }

    void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    void event(String data) {
        for (Listener listener :
                listeners) {
            listener.onUpdate(data);
        }
    }
}
