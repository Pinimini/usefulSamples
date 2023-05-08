package org.example.behavioral.state;

public class OffState implements State {
    @Override
    public State action() {
        System.out.println("Лампочка не светит");
        return StateProvider.getOnState();
    }
}
