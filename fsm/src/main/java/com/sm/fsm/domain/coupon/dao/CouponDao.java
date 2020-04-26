package com.sm.fsm.domain.coupon.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.Coupon;

@Repository
public interface CouponDao extends JpaRepository<Coupon, String> {

}
