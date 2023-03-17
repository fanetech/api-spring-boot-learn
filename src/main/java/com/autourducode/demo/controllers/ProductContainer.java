package com.autourducode.demo.controllers;

import java.util.List;
import java.util.Optional;

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

    @GetMapping
    public List<Product> read() {
        return productService.lire();
    }

    @GetMapping("/{id}")
    public Optional<Product> readOne(@PathVariable Long id) {
        return productService.lireUn(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product) {
        return productService.modifier(id, product);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        return productService.supprimer(id);
    }
}
