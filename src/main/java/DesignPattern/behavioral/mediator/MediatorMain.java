package DesignPattern.behavioral.mediator;

/***
 * mediator pattern defines an object that encapsulates how a set of objects interact. This pattern is considered
 * to be a behavioral pattern due to the way it can alter the program's running behavior.
 */
public class MediatorMain {
    public static void main(String args[]) {
        User john = new User("John");
        User nguyen = new User("Nguyen");
        john.sendMessage("Hello honey");
        nguyen.sendMessage("Hello my honey, love you");
    }
}
