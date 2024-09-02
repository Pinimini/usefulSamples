package ru.simple.callbackdemo;

public class ButtonHandler implements Handler {
    @Override
    public void handle() {
        System.out.println("Кнопка нажата");
    }
}
