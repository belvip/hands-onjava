// src/main/java/com/benarytree/service/PreorderTraversalService.java
package com.benarytree.service;

import com.benarytree.model.Node;
import org.springframework.stereotype.Service;

@Service
public class PreorderTraversalService implements TraversalService {
    @Override
    public void traverse(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        traverse(root.getLeft());
        traverse(root.getRight());
    }
}
