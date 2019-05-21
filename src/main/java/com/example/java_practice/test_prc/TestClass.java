package com.example.java_practice.test_prc;

public class TestClass {
    private Node head = null;

    static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertData(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node traverseNode = head;
            while (traverseNode.next != null) {
                traverseNode = traverseNode.next;
            }
            traverseNode.next = new Node(data);
        }
    }

    public void displayData() {
        if (head == null) {
            System.out.println("No Data");
        } else {
            Node traverseNode = head;
            while (traverseNode != null) {
                System.out.print(traverseNode.data + " ");
                traverseNode = traverseNode.next;
            }
        }
    }
}
