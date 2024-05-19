package DesignPattern.behavioral.observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        subject.addObserver(this);
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println("The Hexa of " + subject.getState() + " is " + Integer.toHexString(subject.getState()));
    }
}
