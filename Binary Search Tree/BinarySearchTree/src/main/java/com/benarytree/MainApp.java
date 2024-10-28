// src/main/java/com/benarytree/MainApp.java
package com.benarytree;

import com.benarytree.config.AppConfig;
import com.benarytree.model.Node;
import com.benarytree.service.BinarySearchTree;
import com.benarytree.service.PostorderTraversalService;
import com.benarytree.service.PreorderTraversalService;
import com.benarytree.service.InorderTraversalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Create and populate the Binary Search Tree
        BinarySearchTree bst = context.getBean(BinarySearchTree.class);
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        Node root = bst.getRoot();

        // Perform traversals
        PreorderTraversalService preorderTraversal = context.getBean(PreorderTraversalService.class);
        System.out.print("Preorder Traversal: ");
        preorderTraversal.traverse(root);
        System.out.println();

        InorderTraversalService inorderTraversal = context.getBean(InorderTraversalService.class);
        System.out.print("Inorder Traversal: ");
        inorderTraversal.traverse(root);
        System.out.println();

        PostorderTraversalService postorderTraversal = context.getBean(PostorderTraversalService.class);
        System.out.print("Postorder Traversal: ");
        postorderTraversal.traverse(root);
        System.out.println();
    }
}
