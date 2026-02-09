package com.aashutosh.ms_product;

import com.aashutosh.ms_product.model.Product;
import com.aashutosh.ms_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productApi")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products/create")
    public Product create(@RequestBody Product product){
        return productRepository.save(product);
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable("name") String name){
        return productRepository.findProductByName(name);
    }
}
