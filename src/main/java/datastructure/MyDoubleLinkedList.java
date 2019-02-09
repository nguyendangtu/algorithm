package datastructure;

public class MyDoubleLinkedList {
    Node head;
    Node tail;

    static class Node {
        int val;
        Node next;
        Node previous;

        Node(int val) {
            this.val = val;
        }
    }

    public void addNode(Node node) {
        if (node == null) return;
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        tail.next = node;
        node.previous = tail;
        tail = tail.next;
    }

    public Node removeNode(Node node) {
        if (node == null) return null;
        if (head.equals(node)) {
            head = head.next;
            head.previous = null;
            return head;
        } else if (tail.equals(node)) {
            tail = tail.previous;
            tail.next = null;
            return tail;
        }

        Node preNode = head;
        Node currentNode = head.next;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.equals(node)) {
                preNode.next = currentNode.next;
                currentNode.next.previous = preNode;
                return currentNode;
            }
            preNode = currentNode;
            currentNode = currentNode.next;

        }

        return null;
    }

    public static void main(String args[]) {
        MyDoubleLinkedList myDoubleLinkedList = new MyDoubleLinkedList();
        MyDoubleLinkedList.Node node10 = new MyDoubleLinkedList.Node(10);
        MyDoubleLinkedList.Node node20 = new MyDoubleLinkedList.Node(20);
        MyDoubleLinkedList.Node node30 = new MyDoubleLinkedList.Node(30);
        MyDoubleLinkedList.Node node40 = new MyDoubleLinkedList.Node(40);
        myDoubleLinkedList.addNode(node10);
        myDoubleLinkedList.addNode(node20);
        myDoubleLinkedList.addNode(node30);
        myDoubleLinkedList.addNode(node40);
        MyDoubleLinkedList.Node node = myDoubleLinkedList.head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        Node currentNode = myDoubleLinkedList.removeNode(node20);
        System.out.println("myDoubleLinkedList after remove node " + node20.val);
        node = myDoubleLinkedList.head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        System.out.println("Previous and Next  node");
        if (currentNode.next != null) {
            System.out.println("Next:" + currentNode.next.val);
        }
        if (currentNode.previous != null) {
            System.out.println("Previous: " + currentNode.previous.val);
        }
    }
}