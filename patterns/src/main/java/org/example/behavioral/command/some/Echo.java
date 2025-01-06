package org.example.behavioral.command.some;

public class Echo implements Command {

    @Override
    public String execute(SomeObject someObject) {
        return someObject.getValue();
    }
}
