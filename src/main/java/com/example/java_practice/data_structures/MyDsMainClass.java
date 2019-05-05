package com.example.java_practice.data_structures;

public class MyDsMainClass {
    public static void main(String[] args) {
        /*Stack<Integer> stack = new Stack<>(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        //stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());*/

        Queue<Integer> queue = new Queue<>(2);
        queue.enQueue(1);
        queue.enQueue(2);
        //queue.enQueue(3);
        System.out.println("isFull:"+queue.isFull());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println("isEmpty:"+queue.isEmpty());

    }
}
