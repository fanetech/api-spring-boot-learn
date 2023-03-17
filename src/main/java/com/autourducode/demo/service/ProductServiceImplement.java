package com.autourducode.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.autourducode.demo.models.Product;
import com.autourducode.demo.repository.ProductRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class ProductServiceImplement implements ProductService {
    
    private final ProductRepository productRepository;

    @Override
    public Product creer(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> lire() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> lireUn(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Product modifier(Long id, Product product) {
        return productRepository.findById(id)
            .map(p -> {
                p.setPrix(product.getPrix());
                p.setNom(product.getNom());
                p.setDescription(product.getDescription());
                return productRepository.save(p);
            }).orElseThrow(() -> new RuntimeException("Produit non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        productRepository.deleteById(id);
        return "Message supprimer";
    }
    
}
