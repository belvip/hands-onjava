package com.benarytree.config;

import com.benarytree.preordermodel.Node;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Marks this class as a configuration class for Spring to define beans and other configurations
@Configuration
// Specifies the base package to scan for Spring components (like @Service, @Component, etc.)
@ComponentScan(basePackages = "com.benarytree.service")
public class AppConfig {

    // Defines a bean for a sample binary tree structure, making it available to the Spring container
    @Bean
    public Node binaryTree() {
        // Creates the root node with a value of 1
        Node root = new Node(1);

        // Sets left and right children for the root node
        root.setLeft(new Node(2));
        root.setRight(new Node(3));

        // Adds further nodes to create a binary tree structure
        root.getLeft().setLeft(new Node(4));
        root.getRight().setRight(new Node(5));

        return root; // Returns the root node, representing the full tree
    }
}
