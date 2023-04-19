package org.example.creational.singleton.demo;

public class LazySingletonDemo {

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton2);

    }
}
