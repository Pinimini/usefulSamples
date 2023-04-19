package org.example.creational.singleton.demo;

public class SampleSingletonDemo {

    public static void main(String[] args) {
        SampleSingleton sampleSingleton = SampleSingleton.getInstance();
        System.out.println(sampleSingleton);

        SampleSingleton sampleSingleton2 = SampleSingleton.getInstance();
        System.out.println(sampleSingleton2);
    }
}
