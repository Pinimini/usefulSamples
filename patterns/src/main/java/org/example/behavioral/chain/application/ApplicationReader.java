package org.example.behavioral.chain.application;

public class ApplicationReader extends ApplicationProcessor {
    @Override
    public void processInternal(Application application) {
        application.addHistoryRecord("Заявление рассмотрено");
    }

    @Override
    public String getProcessName() {
        return "Рассмотрение заявления";
    }
}
