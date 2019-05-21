package com.example.java_practice.data_structures;

import java.util.Stack;

public class DepthFirstSearch {


    public void traverseGraph(Graph.Node[] vertices) {
        //boolean [] visitedList = new boolean[vertices.length];
        Stack<Graph.Node> stack = new Stack<>();
        Graph.Node root = vertices[0];
        stack.push(root);
        System.out.println(root.value);
        root.isVisited = true;
        root = root.adjacencyVertices[0];
        while (!stack.isEmpty()) {
            if (!root.isVisited) {
                stack.push(root);
                System.out.println(root.value);
                root.isVisited = true;
            }

            if (root.adjacencyVertices == null) {
                root = stack.pop();
            } else {
                for (int i = 0; i < root.adjacencyVertices.length; i++) {
                    if (!root.adjacencyVertices[i].isVisited) {
                        root = root.adjacencyVertices[i];
                        break;
                    }
                    if (i == root.adjacencyVertices.length - 1) {
                        root = stack.pop();
                    }
                }
            }

            //root = root.adjacencyVertices[];
        }

    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        Graph.Node[] vertices = graph.getAdjacencyList();
        DepthFirstSearch ds = new DepthFirstSearch();
        ds.traverseGraph(vertices);
    }
}
