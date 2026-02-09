package com.aashutosh.ms_coupons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aashutosh.ms_coupons.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
    public Coupon findByCode(String code);
}
