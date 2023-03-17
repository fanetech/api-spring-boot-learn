package com.autourducode.demo.service;

import java.util.List;
import java.util.Optional;

import com.autourducode.demo.models.Product;

public interface ProductService {
    Product creer(Product product);

    List<Product> lire();

    Optional<Product> lireUn(Long id);

    Product modifier(Long id, Product product);

    String supprimer(Long id);
    
}
