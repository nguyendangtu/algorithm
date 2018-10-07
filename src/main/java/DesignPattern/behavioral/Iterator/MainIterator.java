package DesignPattern.behavioral.Iterator;

public class MainIterator {
    public static void main(String args[]) {
        NameContainer nameContainer = new NameContainer();
        Iterator iterator = nameContainer.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("" + name);
        }
    }
}
