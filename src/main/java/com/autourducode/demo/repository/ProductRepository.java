package com.autourducode.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autourducode.demo.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
