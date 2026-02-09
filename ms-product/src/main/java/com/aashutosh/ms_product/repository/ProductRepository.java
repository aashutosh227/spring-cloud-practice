package com.aashutosh.ms_product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aashutosh.ms_product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findProductByName(String name);
}
