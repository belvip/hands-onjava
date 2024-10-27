package com.benarytree.preordermodel;

public class Node {
    private int value;
    private Node left, right;

    public Node(int value) {
       this.value = value;
       left = right = null;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
