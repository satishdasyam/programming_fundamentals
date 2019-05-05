package com.example.java_practice.data_structures;

public class Graph {
    //Adjacency list
    Node[] vertices = new Node[4];

    public Graph(){
        init();
    }

    private void init(){
        Node vertex1 = new Node();
        vertex1.value = 1;
        Node vertex2 = new Node();
        vertex2.value = 2;
        Node vertex3 = new Node();
        vertex3.value = 3;
        Node vertex4 = new Node();
        vertex4.value = 4;

        vertex1.adjacencyVertices = new Node[2];
        vertex1.adjacencyVertices[0] = vertex4;
        vertex1.adjacencyVertices[1] = vertex3;

        vertex2.adjacencyVertices = new Node[2];
        vertex2.adjacencyVertices[0] = vertex4;
        vertex2.adjacencyVertices[1] = vertex3;

        vertex3.adjacencyVertices = new Node[2];
        vertex3.adjacencyVertices[0] = vertex1;
        vertex3.adjacencyVertices[1] = vertex2;

        vertices[0] = vertex1;
        vertices[1] = vertex2;
        vertices[2] = vertex3;
        vertices[3] = vertex4;
    }

    public Node[] getAdjacencyList() {
        return vertices;
    }

    class Node {
        int value;
        boolean isVisited;
        Node[] adjacencyVertices;
    }
}
