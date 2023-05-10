package org.example.behavioral.visitor.carservice;

public interface Element {
    void accept(Visitor v);
}
