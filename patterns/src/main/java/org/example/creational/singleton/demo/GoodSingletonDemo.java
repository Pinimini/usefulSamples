package org.example.creational.singleton.demo;

public class GoodSingletonDemo {

    //Хороший синглтон, но лучше его вообще не использовать
    public static void main(String[] args) {
        GoodSingleton goodSingleton = GoodSingleton.getInstance();
        System.out.println(goodSingleton);

        GoodSingleton goodSingleton2 = GoodSingleton.getInstance();
        System.out.println(goodSingleton2);

    }
}
