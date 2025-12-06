package com.ecommerce.giva.service;

import com.ecommerce.giva.model.Product;
import com.ecommerce.giva.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getProductsByCategory(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    public List<Product> getTrendingProducts() {
        return productRepository.findByIsTrendingTrue();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
