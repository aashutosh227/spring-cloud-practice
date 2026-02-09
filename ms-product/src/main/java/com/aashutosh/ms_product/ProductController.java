package com.aashutosh.ms_product;

import com.aashutosh.ms_product.feignclients.CouponClient;
import com.aashutosh.ms_product.model.Coupon;
import com.aashutosh.ms_product.model.Product;
import com.aashutosh.ms_product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productApi")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CouponClient couponClient;

    @PostMapping("/products/create")
    public Product create(@RequestBody Product product){
        if(product.getCouponCode()!=null && !product.getCouponCode().isEmpty()){
            Coupon coupon = couponClient.getCoupon(product.getCouponCode());
            if(coupon!=null && coupon.getDiscount()!=null){
                product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
            }
        }
        return productRepository.save(product);
    }

    @GetMapping("/product/{name}")
    public Product getProduct(@PathVariable("name") String name){
        return productRepository.findProductByName(name);
    }
}
