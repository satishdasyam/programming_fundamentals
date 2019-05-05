package com.example.java_practice.test_prc;

import java.util.Arrays;

public class Stack<E> {
    int capacity;
    int top;
    Object[] elements;

    public Stack(int capacity) {
        this.capacity = capacity;
        top = -1;
        elements = new Object[capacity];
    }

    public void push(E e) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        elements[++top] = e;
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (E) elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {//top is array index so starts from 0
        return top + 1 == capacity;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
