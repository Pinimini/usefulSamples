package org.example.behavioral.command.some;

@FunctionalInterface
public interface Command {
    String execute(SomeObject someObject);
}
