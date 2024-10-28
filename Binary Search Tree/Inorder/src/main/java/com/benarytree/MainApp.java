// src/main/java/com/benarytree/MainApp.java
package com.benarytree;

import com.benarytree.config.AppConfig;
import com.benarytree.model.Node;
import com.benarytree.service.InorderTraversalService;
import com.benarytree.service.TraversalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TraversalService traversalService = context.getBean(InorderTraversalService.class); // Explicitly use InorderTraversalService

        Node root = context.getBean(Node.class);

        System.out.print("Inorder Traversal: ");
        traversalService.traverse(root);
    }
}
