package ru.simple.callbackdemo;

public class Button {
    private final Handler handler;

    public Button(Handler handler) {
        this.handler = handler;
    }

    void click() {
        handler.handle();
    }

}
