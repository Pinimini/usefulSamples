package org.example.structural.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugtracker) {
        if (bugtracker.isActiveSprint()) {
            System.out.println("Developer is solving problem...");
        } else {
            System.out.println("Developer reading Habr ...");
        }
    }
}
