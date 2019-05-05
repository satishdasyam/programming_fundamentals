package com.example.java_practice.data_structures;

public class Queue<E> {

    private int front, rear;
    private int queueCapacity;
    private int queueSize;
    private Object[] queueArray;

    public Queue(int size) {
        front = rear = 0;
        queueCapacity = size;
        queueArray = new Object[size];
    }

    public void enQueue(E element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queueArray[rear++] = element;
        queueSize++;
    }

    public E deQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        queueSize--;
        return (E) queueArray[front++];
    }

    public boolean isEmpty() {
        return queueSize == 0;
    }

    public boolean isFull() {
        return queueSize == queueCapacity;
    }
}
