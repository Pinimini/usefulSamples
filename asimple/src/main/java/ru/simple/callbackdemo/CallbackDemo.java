package ru.simple.callbackdemo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CallbackDemo {

    public static void main(String[] args) {
        Handler handler = new ButtonHandler();
        log.info("threadNameByMain1 {}", Thread.currentThread().getName());

        Button button = new Button(() -> {
            System.out.println("Кнопка нажата кастом");
            log.info("threadNameByMain {}", Thread.currentThread().getName());
        });
        button.click();

        log.info("threadNameByMain2 {}", Thread.currentThread().getName());
    }


}
