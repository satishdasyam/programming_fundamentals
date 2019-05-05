package com.example.java_practice.data_structures;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    static class Node {
        Node left, right;
        int key;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public void printInOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);
    }

    public void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.key + " ");
        printInOrder(node.left);
        printInOrder(node.right);
    }

    public void printPostOrder(Node node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.printInOrder(tree.root);
        System.out.println();
        tree.printPreOrder(tree.root);
        System.out.println();
        tree.printPostOrder(tree.root);
        System.out.println();

    }
}
