package org.example.behavioral.chain.application;

public class Demo {
    public static void main(String[] args) {
        Application app = new Application();


        ApplicationProcessor input = new ApplicationInput();
        ApplicationProcessor reader = new ApplicationReader();
        ApplicationProcessor result = new ApplicationResult();

        input.setNext(reader);
        reader.setNext(result);

        input.process(app);
        app.printHistory();

    }
}
