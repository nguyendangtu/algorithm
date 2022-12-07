package DesignPattern.behavioral.observer;

/***
 * named the subject, maintains a list of its dependents, called observers, and notifies them automatically
 * of any state changes, usually by calling one of their methods.
 */
public class MainObserver {
    public static void main(String args[]) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);
        subject.setState(5);
        System.out.println("The state of Subject is " + subject.getState());
        subject.setState(10);
        System.out.println("The state of Subject is " + subject.getState());

    }
}
