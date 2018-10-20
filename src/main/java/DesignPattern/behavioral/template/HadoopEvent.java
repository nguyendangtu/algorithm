package DesignPattern.behavioral.template;

public class HadoopEvent extends EventTemplate {
    @Override
    void register() {
        System.out.println("Register event at abc.com. Hadoop event start at 9AM, MBS");
    }

    @Override
    void startEvent() {
        System.out.println("Event start at 9AM, MBS. We have breakfast, brief event and introduction the purpose of event");
    }

    @Override
    void presentation() {
        System.out.println("We have 5 presentation from 5 companies");
    }

    @Override
    void stopEvent() {
        System.out.println("Event stop at 5PM, we have dinner.");
    }
}
