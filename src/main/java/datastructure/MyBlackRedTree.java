package datastructure;

import java.util.ArrayList;
import java.util.List;

public class MyBlackRedTree {

    private Node root;


    static class Node {
        Node left;
        Node right;
        Node parent;
        String color;
        int val;

        public Node() {
            left = right = parent = null;
            color = null;
        }

        public Node(int val) {
            left = right = parent = null;
            color = null;
            this.val = val;
        }
    }

    public List<Integer> LNR(List<Integer> values, Node node) {

        if (node.left != null) {
            values = LNR(values, node.left);
        }

        values.add(node.val);

        if (node.right != null) {
            values = LNR(values, node.right);
        }

        return values;
    }


    public Node insertBST(int val) {
        Node insertNode = new Node(val);
        insertNode.color = "R";
        if (root == null) {
            insertNode.color = "B";
            root = insertNode;
            return root;
        }

        Node node = root;
        while (node != null) {
            if (val <= node.val) {
                if (node.left == null) {
                    insertNode.parent = node;
                    node.left = insertNode;
                    return insertNode;
                } else {
                    node = node.left;
                }
            } else if (val >= node.val) {
                if (node.right == null) {
                    insertNode.parent = node;
                    node.right = insertNode;
                    return insertNode;
                } else {
                    node = node.right;
                }
            }
        }

        return null;
    }

    public Node insertBRT() {

        return null;
    }

    public static void main(String args[]) {
        MyBlackRedTree tree = new MyBlackRedTree();
        tree.insertBST(50);
        tree.insertBST(40);
        tree.insertBST(75);
        tree.insertBST(25);
        tree.insertBST(45);
        tree.LNR(new ArrayList<>(), tree.root).forEach(System.out::println);
    }
}
