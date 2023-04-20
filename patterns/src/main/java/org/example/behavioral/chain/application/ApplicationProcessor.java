package org.example.behavioral.chain.application;

public abstract class ApplicationProcessor {

    private ApplicationProcessor nextApplicationProcessor;

    public ApplicationProcessor getNext() {
        return nextApplicationProcessor;
    }

    public void setNext(ApplicationProcessor nextApplicationProcessor) {
        this.nextApplicationProcessor = nextApplicationProcessor;
    }

    void process(Application application) {
        before();
        processInternal(application);
        after();
        if (getNext() != null) {
            getNext().process(application);
        }
    }

    private void before() {
        System.out.println("before: " + getProcessName());
    }

    private void after() {
        System.out.println("after: " + getProcessName());
    }

    public abstract void processInternal(Application application);
    public abstract String getProcessName();
}
