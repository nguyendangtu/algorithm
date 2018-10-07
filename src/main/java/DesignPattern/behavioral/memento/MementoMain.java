package DesignPattern.behavioral.memento;

public class MementoMain {
    public static void main(String args[]) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #2");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("State $4");
        careTaker.addMemento(originator.saveStateToMemento());

        System.out.println("Current State:" + originator.getState());

        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("First State is " + originator.getState());

        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("Second State is " + originator.getState());
    }
}
