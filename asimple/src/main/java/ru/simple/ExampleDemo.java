package ru.simple;

import ru.simple.dto.DemoObject;

import java.util.HashSet;
import java.util.Set;

public class ExampleDemo {
    static DemoObject do1 = new DemoObject("one");
    static DemoObject do2 = new DemoObject("two");

    static Set set = new HashSet();

    public static void main(String[] args) {
        set.add(do1);
        set.add(do2);
        set.stream().forEach(System.out::println);
    }

}
