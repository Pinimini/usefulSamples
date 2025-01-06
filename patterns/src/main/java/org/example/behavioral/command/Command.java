package org.example.behavioral.command;

@FunctionalInterface
public interface Command {
    String execute(SomeObject someObject);
}
