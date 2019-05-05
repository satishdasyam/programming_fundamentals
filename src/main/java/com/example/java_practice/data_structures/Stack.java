package com.example.java_practice.data_structures;

public class Stack<E> {
    private int top;
    private int stackSize;
    private Object[] stackArray;

    public Stack(int size) {
        stackSize = size;
        stackArray = new Object[size];
        top = -1;
    }

    public E pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return (E) stackArray[top--];
    }

    public void push(E element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stackArray[++top] = element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top - 1 == stackSize;
        //top==stackSize-1
    }

}
