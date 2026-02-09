package com.aashutosh.ms_coupons;

import com.aashutosh.ms_coupons.model.Coupon;
import com.aashutosh.ms_coupons.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponApi")
public class CouponController {

    @Autowired
    private CouponRepository couponRepository;

    @PostMapping("/coupons")
    public Coupon create(@RequestBody Coupon coupon){
        return couponRepository.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable("code") String code){
        return couponRepository.findByCode(code);
    }
}
