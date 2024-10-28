// src/main/java/com/benarytree/service/InorderTraversalService.java
package com.benarytree.service;

import com.benarytree.model.Node;
import org.springframework.stereotype.Service;

@Service
public class InorderTraversalService implements TraversalService {

    @Override
    public void traverse(Node root) {
        if (root == null) {
            return;
        }

        // Traverse left subtree
        traverse(root.getLeft());

        // Visit the root
        System.out.print(root.getValue() + " ");

        // Traverse right subtree
        traverse(root.getRight());
    }
}
