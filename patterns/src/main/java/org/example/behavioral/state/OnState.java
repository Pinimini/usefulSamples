package org.example.behavioral.state;

public class OnState implements State {
    @Override
    public State action() {
        System.out.println("Лампочка светит");
        return StateProvider.getOffState();
    }
}
