package com.trainning.springboot_crud_api.controller;

import com.trainning.springboot_crud_api.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    // List of products
    private List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1L, "Laptop", "Electronics", 10));
        products.add(new Product(2L, "Phone", "Electronics", 20));
        products.add(new Product(3L, "Book", "Books", 5));
        products.add(new Product(4L, "T-Shirt", "Clothing", 15));
        products.add(new Product(5L, "Jeans", "Clothing", 25));
        products.add(new Product(6L, "Sneakers", "Shoes", 30));
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return products;
    }

    @GetMapping("/products/{id}")
    public Product getAllProductsById(@PathVariable Long id){
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/products/{id}/{category}")
    public Product getAllProductsByIdAndCategory(@PathVariable Long id, @PathVariable String category){
        return products.stream()
                .filter(product -> product.getId().equals(id) && product.getCategory().equalsIgnoreCase(category))
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        product.setId((long) (products.size()) + 1);
        products.add(product);
        return product;
    }

    @PutMapping("/products/{id}")
    public Product updtadeProduct(@PathVariable Long id, @RequestBody Product updateProduct) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .map(product -> {
                    product.setName(updateProduct.getName());
                    product.setCategory(updateProduct.getCategory());
                    product.setQuantity(updateProduct.getQuantity());

                    return product;
                })
                .orElse(null);
    }

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable Long id) {
        products.removeIf(product -> product.getId().equals(id));
        return "Product deleted successfully";
    }






}
