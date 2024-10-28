package com.benarytree.preordermodel;

// This class represents a node in a binary tree
public class Node {
    // The value stored in this node
    private int value;

    // Pointers to the left and right child nodes
    private Node left, right;

    // Constructor to initialize a node with a specific value; child nodes are initially set to null
    public Node(int value) {
        this.value = value;
        left = right = null;
    }

    // Getter method to retrieve the value of the node
    public int getValue() {
        return value;
    }

    // Getter method for the left child of the node
    public Node getLeft() {
        return left;
    }

    // Setter method to assign the left child of the node
    public void setLeft(Node left) {
        this.left = left;
    }

    // Getter method for the right child of the node
    public Node getRight() {
        return right;
    }

    // Setter method to assign the right child of the node
    public void setRight(Node right) {
        this.right = right;
    }
}
