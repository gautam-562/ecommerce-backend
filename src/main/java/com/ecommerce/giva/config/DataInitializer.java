package com.ecommerce.giva.config;

import com.ecommerce.giva.model.Category;
import com.ecommerce.giva.model.Product;
import com.ecommerce.giva.repository.CategoryRepository;
import com.ecommerce.giva.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

        @Bean
        CommandLineRunner initDatabase(CategoryRepository categoryRepository, ProductRepository productRepository) {
                return args -> {
                        // Categories
                        Category necklaces = new Category(null, "Necklaces", "Elegant necklaces for every occasion",
                                        "https://www.giva.co/cdn/shop/collections/Necklaces_1.jpg", null);
                        Category earrings = new Category(null, "Earrings", "Stunning earrings to sparkle",
                                        "https://www.giva.co/cdn/shop/collections/Earrings_1.jpg", null);
                        Category rings = new Category(null, "Rings", "Beautiful rings for your fingers",
                                        "https://www.giva.co/cdn/shop/collections/Rings_1.jpg", null);

                        categoryRepository.saveAll(Arrays.asList(necklaces, earrings, rings));

                        // Products
                        Product p1 = new Product(null, "Silver Rose Gold Heart Necklace", "A beautiful heart necklace",
                                        1599.0,
                                        "https://www.giva.co/cdn/shop/products/PD-1.jpg", true, necklaces);
                        Product p2 = new Product(null, "Silver Zircon Stud Earrings", "Classic stud earrings", 999.0,
                                        "https://www.giva.co/cdn/shop/products/ER-1.jpg", true, earrings);
                        Product p3 = new Product(null, "Silver Solitaire Ring", "Elegant solitaire ring", 1299.0,
                                        "https://www.giva.co/cdn/shop/products/RG-1.jpg", false, rings);
                        Product p4 = new Product(null, "Silver Butterfly Necklace", "Charming butterfly design", 1899.0,
                                        "https://www.giva.co/cdn/shop/products/PD-2.jpg", true, necklaces);

                        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
                };
        }
}
