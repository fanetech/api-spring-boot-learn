package com.autourducode.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.autourducode.demo.models.Product;
import com.autourducode.demo.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductContainer {

    private final ProductService productService;

    @PostMapping("/create")
    public Product create(@RequestBody Product product){
        return productService.creer(product);
    }
}
