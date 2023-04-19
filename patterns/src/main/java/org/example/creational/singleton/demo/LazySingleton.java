package org.example.creational.singleton.demo;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {

            //Тут будут проблемы с многопоточностью
            instance = new LazySingleton();
        }
        return instance;
    }
}
