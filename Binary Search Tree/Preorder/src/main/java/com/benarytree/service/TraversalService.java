package com.benarytree.service;

import com.benarytree.preordermodel.Node;

// Interface defining traversal operations for a binary tree
public interface TraversalService {

    // Method to perform a preorder traversal starting from the specified root node
    void preorderTraversal(Node root);
}
