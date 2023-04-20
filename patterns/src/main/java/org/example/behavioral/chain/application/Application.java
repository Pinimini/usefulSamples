package org.example.behavioral.chain.application;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final List<String> history = new ArrayList<>();

    void addHistoryRecord(String historyRecord) {
        history.add(historyRecord);
    }

    void printHistory() {
        System.out.println(history);
    }
}
