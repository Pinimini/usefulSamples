package org.example.behavioral.memento.demo;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        Originator originator = new Originator(LocalDateTime::now);

        State abc = new State(new String[]{"A", "B", "C"});
        System.out.println(abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A1";
        System.out.println(abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A2";
        System.out.println(abc);

        originator.saveState(abc);
        abc.getArray()[0] = "A3";
        System.out.println(abc);

        System.out.println("  undo changes");

        abc = originator.restoreState();
        System.out.println(abc);

        abc = originator.restoreState();
        System.out.println(abc);

        abc = originator.restoreState();
        System.out.println(abc);
    }
}
