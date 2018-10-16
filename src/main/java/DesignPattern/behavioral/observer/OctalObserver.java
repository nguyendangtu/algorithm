package DesignPattern.behavioral.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        subject.attach(this);
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println("The Octal of " + subject.getState() + " is " + Integer.toOctalString(subject.getState()));
    }
}
