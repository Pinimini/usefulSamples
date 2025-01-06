package org.example.behavioral.command.database;

public class UpdateCommand implements Command {

    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
