package org.example.behavioral.memento.demo;

import java.util.Arrays;

public class State {

    private final String[] array;

    State(String[] array) {
        this.array= array;
    }

    State(State state) {
        this.array = Arrays.copyOf(state.getArray(), state.getArray().length);
    }

    public String[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "State{" +
                "array=" + (array == null ? null : Arrays.asList(array)) +
                '}';
    }
}
