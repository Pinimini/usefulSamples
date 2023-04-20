package org.example.behavioral.chain.application;

public class ApplicationInput extends ApplicationProcessor {
    @Override
    public void processInternal(Application application) {
        application.addHistoryRecord("Заявление принято");
    }

    @Override
    public String getProcessName() {
        return "Рассмотрение заявления";
    }
}
