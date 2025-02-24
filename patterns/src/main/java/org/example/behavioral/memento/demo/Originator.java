package org.example.behavioral.memento.demo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Originator {

    //Это Originator + Caretaker
    private final Deque<Memento> stack = new ArrayDeque<>();

    private final DateTimeProvider dateTimeProvider;

    public Originator(DateTimeProvider dateTimeProvider) {
        this.dateTimeProvider = dateTimeProvider;
    }

    void saveState(State state) {
        stack.push(new Memento(state, dateTimeProvider.getDate()));
    }

    State restoreState() {
        Memento memento = stack.pop();
        System.out.println("createdAt:" + memento.getCreatedAt());
        return memento.getState();
    }
}
