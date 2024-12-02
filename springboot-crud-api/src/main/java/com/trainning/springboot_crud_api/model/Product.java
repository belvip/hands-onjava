package com.trainning.springboot_crud_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private String category;
    private int quantity;

}
