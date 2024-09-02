package ru.simple.callbackdemo;

public class CallbackDemo {

    public static void main(String[] args) {
        Handler handler = new ButtonHandler();

        Button button = new Button(() -> System.out.println("Кнопка нажата кастом"));

        button.click();
    }

}
