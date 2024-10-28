// src/main/java/com/benarytree/service/BinarySearchTree.java
package com.benarytree.service;

import com.benarytree.model.Node;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.getValue()) {
            root.setLeft(insertRec(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insertRec(root.getRight(), value));
        }

        return root;
    }

    public Node getRoot() {
        return root;
    }
}
