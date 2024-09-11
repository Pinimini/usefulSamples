package ru.simple.callbackdemo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Button {
    private final Handler handler;

    public Button(Handler handler) {
        this.handler = handler;
    }

    void click() {
        Thread thread = new Thread(() -> {
            handler.handle();
            log.info("threadNameByButton {}", Thread.currentThread().getName());
        });
        thread.start();
    }



}
