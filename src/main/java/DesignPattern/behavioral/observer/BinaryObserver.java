package DesignPattern.behavioral.observer;

public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        subject.addObserver(this);
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println("Binary of " + subject.getState() + " is " + Integer.toBinaryString(subject.getState()));
    }
}
