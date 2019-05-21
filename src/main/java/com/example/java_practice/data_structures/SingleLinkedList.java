package com.example.java_practice.data_structures;

public class SingleLinkedList {

    Node root;

    static class Node<E> {
        E value;
        Node next;
    }

    public void insert(Node value) {
        if (root == null) {
            root = value;
        } else {
            Node traverseNode = root;
            while (traverseNode.next != null) {
                traverseNode = traverseNode.next;
            }
            traverseNode.next = value;
        }
    }

    public void displayLinkedList() {
        if(root == null){
            System.out.println("Empty list");
        }else{
            int value = (int) root.value;
            System.out.println(value);
            Node traverseNode = root;
            while (traverseNode.next!=null) {
                int value1 = (int) traverseNode.next.value;
                System.out.println(value1);
                traverseNode = traverseNode.next;
            }
        }

    }

    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        Node<Integer> firstNode = new Node<>();
        firstNode.value = 1;
        Node<Integer> secondNode = new Node<>();
        secondNode.value = 2;
        Node<Integer> thirdNode = new Node<>();
        thirdNode.value = 3;
        Node<Integer> fourthNode = new Node<>();
        fourthNode.value = 4;
        linkedList.insert(firstNode);
        linkedList.insert(secondNode);
        linkedList.insert(thirdNode);
        linkedList.insert(fourthNode);
        linkedList.displayLinkedList();
    }
}
