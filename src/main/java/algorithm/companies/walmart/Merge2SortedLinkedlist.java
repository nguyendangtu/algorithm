package algorithm.companies.walmart;

/**
 * @author : JOHNNGUYEN
 * @since : 8/30/2023, Wed
 **/
public class Merge2SortedLinkedlist {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n4.next = n5;
        n5.next = n6;
        Node node = merge2SortedLinkedList(n1, n4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static Node merge2SortedLinkedList(Node list1, Node list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        Node root;
        if (list1.val < list2.val) {
            root = new Node(list1.val);
            list1 = list1.next;
        } else {
            root = new Node(list2.val);
            list2 = list2.next;
        }

        Node result = root;
        while (list1 != null && list2 != null) {
            int val;
            if (list1.val < list2.val) {
                val = list1.val;
                list1 = list1.next;
            } else {
                val = list2.val;
                list2 = list2.next;
            }
            result.next = new Node(val);
            result = result.next;
        }

        if (list1 != null) {
            result.next = list1;
        }

        if (list2 != null) {
            result.next = list2;
        }
        return root;
    }


}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
