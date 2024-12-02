package com.example.securitydemo.jwt;

import com.fasterxml.jackson.databind.ObjectMapper; // For converting Java objects to JSON
import jakarta.servlet.ServletException; // To handle servlet-related exceptions
import jakarta.servlet.http.HttpServletRequest; // Represents HTTP requests
import jakarta.servlet.http.HttpServletResponse; // Represents HTTP responses
import org.slf4j.Logger; // Logger for logging messages
import org.slf4j.LoggerFactory; // Factory for creating Logger instances
import org.springframework.http.MediaType; // Represents HTTP media types
import org.springframework.security.web.AuthenticationEntryPoint; // Spring Security's interface for handling unauthorized access
import org.springframework.stereotype.Component; // Marks this class as a Spring component
import org.springframework.security.core.AuthenticationException; // Represents authentication-related exceptions in Spring Security

import java.io.IOException; // Handles input/output exceptions
import java.util.HashMap; // A map implementation for storing key-value pairs
import java.util.Map; // Interface for key-value mapping

/**
 * AuthEntryPointJwt is an implementation of AuthenticationEntryPoint.
 * It handles unauthorized access attempts by sending a custom JSON response
 * with error details.
 */
@Component // Marks this class as a Spring-managed bean
public class AuthEntryPointJwt implements AuthenticationEntryPoint {

    // Logger instance for logging error messages
    private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

    /**
     * Handles unauthorized access attempts.
     *
     * @param request       the HTTP request object
     * @param response      the HTTP response object
     * @param authException the exception thrown during authentication failure
     * @throws IOException      if an input or output error occurs
     * @throws ServletException if a servlet-specific error occurs
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
            throws IOException, ServletException {

        // Log the unauthorized access attempt with the exception message
        logger.error("Unauthorized error: {}", authException.getMessage());

        // Set the response content type to JSON
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);

        // Set the HTTP status code to 401 (Unauthorized)
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        // Create a map to hold the error details
        final Map<String, Object> body = new HashMap<>();
        body.put("status", HttpServletResponse.SC_UNAUTHORIZED); // HTTP status code
        body.put("error", "Unauthorized"); // Error message
        body.put("message", authException.getMessage()); // Exception message
        body.put("path", request.getServletPath()); // Path of the request that caused the error

        // Use ObjectMapper to convert the map to a JSON string and write it to the response output stream
        final ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getOutputStream(), body);
    }
}
