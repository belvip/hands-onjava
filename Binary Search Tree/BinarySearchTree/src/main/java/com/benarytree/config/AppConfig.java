// src/main/java/com/benarytree/config/AppConfig.java
package com.benarytree.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.benarytree")
public class AppConfig {
    // Additional bean configurations can be added here if needed
}
