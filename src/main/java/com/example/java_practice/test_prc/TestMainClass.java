package com.example.java_practice.test_prc;

public class TestMainClass {

    public static void main(String [] args) {
        Stack<Integer> stack = new Stack<>(5);
        //stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.isFull());
        System.out.println(stack.toString());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());
        stack.push(1);
        System.out.println(stack.toString());
        //stack.push(6);
    }
}

