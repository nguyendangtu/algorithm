package datastructure;

/***
 * A linked list is a linear data structure where each element is a separate object.
 *
 */
public class MyLinkedList {
    Node head;
    Node tail;

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        tail = tail.next;
    }

    public void removeNode(Node node) {
        if (node.equals(head)) {
            head = head.next;
            return;
        }
        Node currentNode = head.next;
        Node preNode = head;
        while (currentNode != null) {
            if (currentNode.equals(node)) {
                if (currentNode.equals(tail)) {
                    preNode.next = null;
                    tail = preNode;
                    break;
                } else {
                    preNode.next = currentNode.next;
                    break;
                }
            }
            preNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public static void main(String args[]) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList.Node node10 = new MyLinkedList.Node(10);
        MyLinkedList.Node node20 = new MyLinkedList.Node(20);
        MyLinkedList.Node node30 = new MyLinkedList.Node(30);
        MyLinkedList.Node node40 = new MyLinkedList.Node(40);
        myLinkedList.addNode(node10);
        myLinkedList.addNode(node20);
        myLinkedList.addNode(node30);
        myLinkedList.addNode(node40);
        MyLinkedList.Node node = myLinkedList.head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("MyLinkedList after remove");
        myLinkedList.removeNode(node20);
        node = myLinkedList.head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }


    }

}
