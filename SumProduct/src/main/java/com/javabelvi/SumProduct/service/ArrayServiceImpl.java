package com.javabelvi.SumProduct.service;

import org.springframework.stereotype.Service;

@Service
public class ArrayServiceImpl implements ArrayService {

    @Override
    public int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array){
            sum += number;
        }
        return sum;
    }

    @Override
    public int calculateProduct(int[] array) {
        int product = 1;
        for (int number : array){
            product *= number;
        }
        return product;
    }
}
