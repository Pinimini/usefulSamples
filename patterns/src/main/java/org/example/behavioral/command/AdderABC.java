package org.example.behavioral.command;

public class AdderABC implements Command {

    @Override
    public String execute(SomeObject someObject) {
        someObject.setValue(someObject.getValue() + "ABC");
        return "ABC Added";
    }
}
