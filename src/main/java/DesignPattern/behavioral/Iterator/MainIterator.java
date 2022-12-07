package DesignPattern.behavioral.Iterator;

/***
 * iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements
 */
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
