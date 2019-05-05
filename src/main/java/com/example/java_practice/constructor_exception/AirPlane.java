package com.example.java_practice.constructor_exception;

import java.io.IOException;

public class AirPlane {
    public AirPlane() throws IOException {
        System.out.println("AirPlane");
        throw new IOException();
    }

   /* static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        } else {
            SinglyLinkedListNode mergedHead = null;
            SinglyLinkedListNode traverseNode = head1;
            while (traverseNode.next != null) {
                if (head1.data < head2.data) {
                    if (mergedHead == null) {
                        mergedHead = head1;
                    } else {
                        mergedHead.next = head1;
                    }
                    head1 = head1.next;
                    traverseNode = head1;
                } else if (head1.data > head2.data) {
                    if (mergedHead == null) {
                        mergedHead = head2;
                    } else {
                        mergedHead.next = head2;
                    }
                    head2 = head2.next;
                    traverseNode = head2;
                } else {
                    if (mergedHead == null) {
                        mergedHead = head2;
                        mergedHead.next = head1;
                    } else {
                        mergedHead.next = head2;
                        mergedHead.next = head1;
                    }
                    head1 = head1.next;
                    head2 = head2.next;
                    traverseNode = head1;
                }
            }
            if (head1 != null) {
                while (head1.next != null) {
                    mergedHead.next = head1.next;
                    head1 = head1.next;
                }

            }
            if (head2 != null) {
                while (head2.next != null) {
                    mergedHead.next = head2.next;
                    head2 = head2.next;
                }
            }
            return mergedHead;
        }
    }*/
}


