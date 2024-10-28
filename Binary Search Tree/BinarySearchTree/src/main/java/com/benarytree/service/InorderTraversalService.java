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
        traverse(root.getLeft());
        System.out.print(root.getValue() + " ");
        traverse(root.getRight());
    }
}
