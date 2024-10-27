package com.benarytree.config;

import com.benarytree.preordermodel.Node;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("basePackage = com.benarytree.service")
public class AppConfig {
    @Bean
    public Node binaryTree(){
        Node root = new Node(1);
        root.setLeft(new Node(2));
        root.setRight(new Node(3));
        root.getLeft().setLeft(new Node(4));
        root.getRight().setRight(new Node(5));

        return root;
    }
}
