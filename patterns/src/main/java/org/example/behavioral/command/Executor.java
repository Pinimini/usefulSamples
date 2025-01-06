package org.example.behavioral.command;

import java.util.ArrayDeque;
import java.util.Queue;

public class Executor {

    private final SomeObject someObject;

    private final Queue<Command> commands = new ArrayDeque<>();

    public Executor(SomeObject someObject) {
        this.someObject = someObject;
    }

    void addCommand(Command command) {
        commands.add(command);
    }

    void executeCommand() {
        Command command;
        while ((command = commands.poll()) != null) {
            String result = command.execute(someObject);
            System.out.println("command execution result: " + result);
        }
    }
}
