package org.example.behavioral.strategy;

public class Demo {
    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new Bus());
        context.applyStrategy();

        context.setStrategy(new Car());
        context.applyStrategy();

        context.setStrategy(new Taxi());
        context.applyStrategy();

        context.setStrategy(() -> System.out.println("Долететь на ракете"));
        context.applyStrategy();
    }
}
