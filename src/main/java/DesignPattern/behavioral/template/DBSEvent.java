package DesignPattern.behavioral.template;

public class DBSEvent extends EventTemplate {
    @Override
    void register() {
        System.out.println("Register event at dbs.com. DBS event start at 9AM, MBS");
    }

    @Override
    void startEvent() {
        System.out.println("DBS Event start at 9AM, MBS. We have breakfast, brief event and introduction the purpose of event");
    }

    @Override
    void presentation() {
        System.out.println("We have 5 presentation from 5 departments");
    }

    @Override
    void stopEvent() {
        System.out.println("DBS Event stop at 5PM, we have dinner.");
    }
}
