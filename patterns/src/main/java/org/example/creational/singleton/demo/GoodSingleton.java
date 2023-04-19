package org.example.creational.singleton.demo;

public class GoodSingleton {
    private GoodSingleton() {
    }

    static GoodSingleton getInstance() {
        return GoodSingletonHolder.instance;
    }

    private static class GoodSingletonHolder {
        static final GoodSingleton instance = new GoodSingleton();
    }
}
