package org.example.behavioral.chain.application;

public class ApplicationResult extends ApplicationProcessor {
    @Override
    public void processInternal(Application application) {
        application.addHistoryRecord("Выдача результата");
    }

    @Override
    public String getProcessName() {
        return "Результат выдан";
    }
}
