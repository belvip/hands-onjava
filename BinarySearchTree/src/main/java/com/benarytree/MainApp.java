package com.benarytree;

import com.benarytree.config.AppConfig;
import com.benarytree.preordermodel.Node;
import com.benarytree.service.TraversalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TraversalService traversalService = context.getBean(TraversalService.class);
        Node root = context.getBean(Node.class);

        System.out.print("Preorder Traversal: ");
        traversalService.preorderTraversal(root);
    }
}
