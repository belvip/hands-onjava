package com.javabelvi.SumProduct.controller;

import com.javabelvi.SumProduct.service.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SumProductController {
    @Autowired
    private ArrayService arrayService;

    @PostMapping("/calculate")
    public String calculate(@RequestBody int[] array){
        if(array.length == 0){
            return "Please enter a non-empty array of integers";
        }

        // Calculate the sum including all numbers
        int sum = arrayService.calculateSum(array);

        // Filter out negative numbers for product calculation
        int[] nonNegativeArray = java.util.Arrays.stream(array)
                .filter(num -> num >= 0)
                .toArray();

        // Calculate product of non-negative numbers
        int product = nonNegativeArray.length > 0 ? arrayService.calculateProduct(nonNegativeArray) : 0;

        return String.format("Sum (including negatives): %d, Product (excluding negatives): %d", sum, product);
    }

    @GetMapping("/calculate")
    public String calculateGet(@RequestParam int[] array) {
        if (array.length == 0) {
            return "Please enter a non-empty array of integers";
        }

        int sum = arrayService.calculateSum(array);
        int[] nonNegativeArray = java.util.Arrays.stream(array)
                .filter(num -> num >= 0)
                .toArray();
        int product = nonNegativeArray.length > 0 ? arrayService.calculateProduct(nonNegativeArray) : 0;

        return String.format("Sum (including negatives): %d, Product (excluding negatives): %d", sum, product);
    }

    

}
