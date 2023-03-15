package com.autourducode.demo.service;

import java.util.List;

import com.autourducode.demo.models.Product;

public interface ProductService {
    Product creer(Product product);

    List<Product> lire();

    Product modifier(Long id, Product product);

    String supprimer(Long id);
    
}
