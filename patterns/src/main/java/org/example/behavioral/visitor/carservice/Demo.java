package org.example.behavioral.visitor.carservice;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Element> elementList = Arrays.asList(new Brake(), new Engine(), new Transmission());

        Visitor visitor = new CarService();
        elementList.forEach(element -> element.accept(visitor));

        System.out.println();

        Visitor visitorVip = new CarServiceVip();
        elementList.forEach(elem -> elem.accept(visitorVip));
    }
}
