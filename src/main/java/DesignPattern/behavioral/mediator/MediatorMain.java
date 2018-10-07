package DesignPattern.behavioral.mediator;

public class MediatorMain {
    public static void main(String args[]) {
        User john = new User("John");
        User nguyen = new User("Nguyen");
        john.sendMessage("Hello honey");
        nguyen.sendMessage("Hello my honey, love you");
    }
}
