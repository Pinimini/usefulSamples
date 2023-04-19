package org.example.creational.singleton.demo;

public class SampleSingleton {
    //Может создаваться тяжелый объект, который может не понадобиться
    private static SampleSingleton instance = new SampleSingleton();

    private SampleSingleton() {
    }

    public static SampleSingleton getInstance() {
        return instance;
    }
}
