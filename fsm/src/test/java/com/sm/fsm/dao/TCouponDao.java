package com.sm.fsm.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.fsm.TAbstractDao;
import com.sm.fsm.domain.coupon.CouponDao;
import com.sm.fsm.model.entity.Coupon;

public class TCouponDao extends TAbstractDao {
	
	@Autowired
	private CouponDao couponDao;
	
	@Test
	public void save() {
		
		String accountId = "fd523355-cc78-4ab5-a45b-3644405da7a2";
		
		Coupon coupon = Coupon.builder()
				.accountId(accountId)
				.build();
		
		couponDao.save(coupon);
		
	}

}
