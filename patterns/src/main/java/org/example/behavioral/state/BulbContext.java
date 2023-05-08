package org.example.behavioral.state;

public class BulbContext {

    private State state = StateProvider.getOffState();

    void performAction() {
        setState(state.action());
    }

    private void setState(State state) {
        this.state = state;
    }
}
