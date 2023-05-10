package org.example.behavioral.visitor.carservice;

public class Engine implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    String checkEngine() {
        return "Проверить двигатель";
    }
}
