package datastructure;

import java.util.ArrayList;
import java.util.List;

public class MyBinarySearchTree {

    private Node root;

    public MyBinarySearchTree() {
        root = null;
    }


    public Node insert(int val) {
        Node insertNode = new Node(val);
        if (root == null) {
            root = insertNode;
            return root;
        }

        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.val >= val) {
                if (currentNode.left == null) {
                    currentNode.setLeft(insertNode);
                    return insertNode;
                } else {
                    currentNode = currentNode.left;
                }
            } else if (currentNode.val <= val) {
                if (currentNode.right == null) {
                    currentNode.setRight(insertNode);
                    return insertNode;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
        return null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    /***
     * Node
     */
    static class Node {
        int val;
        Node left;
        Node right;

        public Node() {
            left = right = null;
            this.val = 0;
        }

        public Node(int val) {
            left = right = null;
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
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

    public List<Integer> RNL(List<Integer> values, Node node) {

        if (node.right != null) {
            values = RNL(values, node.right);
        }

        values.add(node.val);

        if (node.left != null) {
            values = RNL(values, node.left);
        }

        return values;
    }

    public Node search(Node node, int val) {
        if (node.val > val && node.left != null) {
            return search(node.left, val);
        } else if (node.val < val && node.right != null) {
            return search(node.right, val);
        }
        if (node.val == val) {
            return node;
        }
        return null;
    }

    public Node searchParent(Node node, int val) {

        if (node.val < val && node.right != null) {
            if (node.right.val == val) {
                return node;
            } else {
                return searchParent(node.right, val);
            }
        } else if (node.val > val && node.left != null) {
            if (node.left.val == val) {
                return node;
            } else {
                return searchParent(node.left, val);
            }
        }

        return null;
    }

    public Node delete(int val) {
        Node searchNode = search(root, val);
        Node parentNode = searchParent(root, val);
        Node maxLeftNode = getMaxLeftNode(searchNode);
        if (maxLeftNode == null) {
            if (searchNode.right != null) {
                if (parentNode != null) {
                    if (parentNode.left != null && parentNode.left.val == searchNode.val) {
                        parentNode.left = searchNode.right;
                    } else if (parentNode.right != null && parentNode.right.val == searchNode.val) {
                        parentNode.right = searchNode.right;
                    }
                } else {
                    root = null;
                }
            } else {
                return deleteLeafNode(searchNode);
            }
        } else {
            deleteLeafNode(maxLeftNode);
            searchNode.setVal(maxLeftNode.val);
        }
        return null;

    }

    public void swap(Node searchNode, Node maxLeftNode) {
        int val = searchNode.val;
        searchNode.setVal(maxLeftNode.val);
        maxLeftNode.setVal(val);
    }

    public Node deleteLeafNode(Node node) {
        if (node.left != null || node.right != null) return null;
        Node parentDeleteNode = searchParent(root, node.val);
        if (parentDeleteNode != null) {
            if (parentDeleteNode.left != null && parentDeleteNode.left.val == node.val) {
                parentDeleteNode.left = null;
            } else if (parentDeleteNode.right != null && parentDeleteNode.right.val == node.val) {
                parentDeleteNode.right = null;
            }
        }
        return node;
    }

    public Node getMaxNode(Node node) {
        if (node.right != null) {
            return getMaxNode(node.right);
        }
        return node;
    }

    public Node getMaxLeftNode(Node node) {
        if (node.left != null) {
            return getMaxNode(node.left);
        }
        return null;
    }

    public static void main(String args[]) {
        MyBinarySearchTree myBinaryTree = new MyBinarySearchTree();
        myBinaryTree.insert(15);
        myBinaryTree.insert(7);
        myBinaryTree.insert(20);
        myBinaryTree.insert(17);
        myBinaryTree.insert(25);
        myBinaryTree.insert(16);
        myBinaryTree.insert(18);
        myBinaryTree.insert(4);
        myBinaryTree.insert(8);
        System.out.println("Tree Value increase");
        List<Integer> lnr = myBinaryTree.LNR(new ArrayList<>(), myBinaryTree.root);
        lnr.forEach(System.out::println);
        System.out.println("Tree Value decrease");
        List<Integer> nrl = myBinaryTree.RNL(new ArrayList<>(), myBinaryTree.root);
        nrl.forEach(System.out::println);
        Node searchNode = myBinaryTree.search(myBinaryTree.root, 15);
        System.out.println("searchNode val = " + searchNode.val);
        Node maxLeftNode = myBinaryTree.getMaxLeftNode(searchNode);
        System.out.println("max left node val = " + maxLeftNode.val);
        Node searchParentNode = myBinaryTree.searchParent(myBinaryTree.root, 15);
        System.out.println("searchParentNode val = " + (searchParentNode != null ? searchParentNode.val : "null"));
        myBinaryTree.delete(17);
        System.out.println("Tree Value after delete");
        List<Integer> lnr1 = myBinaryTree.LNR(new ArrayList<>(), myBinaryTree.root);
        lnr1.forEach(System.out::println);
    }
}