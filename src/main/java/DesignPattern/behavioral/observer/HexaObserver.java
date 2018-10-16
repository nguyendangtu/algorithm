package DesignPattern.behavioral.observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        subject.attach(this);
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println("The Hexa of " + subject.getState() + " is " + Integer.toHexString(subject.getState()));
    }
}
