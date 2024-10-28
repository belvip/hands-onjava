package com.benarytree;

import com.benarytree.config.AppConfig;
import com.benarytree.preordermodel.Node;
import com.benarytree.service.TraversalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // Initialize the Spring Application Context using the AppConfig configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the TraversalService bean from the context, which provides the preorder traversal method
        TraversalService traversalService = context.getBean(TraversalService.class);

        // Retrieve the Node bean (binary tree root) from the context, which was defined in AppConfig
        Node root = context.getBean(Node.class);

        // Execute the preorder traversal on the binary tree, starting from the root node
        System.out.print("Preorder Traversal: ");
        traversalService.preorderTraversal(root);
    }
}
