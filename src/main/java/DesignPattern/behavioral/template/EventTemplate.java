package DesignPattern.behavioral.template;

public abstract class EventTemplate {
    abstract void register();

    abstract void startEvent();

    abstract void presentation();

    abstract void stopEvent();

    public void populateEvent() {
        register();
        startEvent();
        presentation();
        stopEvent();
    }


}
