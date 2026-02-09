package com.aashutosh.ms_product.feignclients;

import com.aashutosh.ms_product.model.Coupon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("MS-COUPONS")
public interface CouponClient {

    @GetMapping("/couponApi/coupons/{code}")
    Coupon getCoupon(@PathVariable("code") String code);

}
