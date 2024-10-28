package com.benarytree.service;

import com.benarytree.preordermodel.Node;
import org.springframework.stereotype.Service;

// Service class to perform preorder traversal on a binary tree
@Service
public class PreorderTraversalService implements TraversalService {

    // Overridden method to perform preorder traversal on the binary tree starting from the given root node
    @Override
    public void preorderTraversal(Node root) {
        // Base case: if the root node is null, exit the method
        if (root == null) {
            return;
        }

        // Visit the root node and print its value
        System.out.print(root.getValue() + " ");

        // Recursively traverse the left subtree
        preorderTraversal(root.getLeft());

        // Recursively traverse the right subtree
        preorderTraversal(root.getRight());
    }
}
