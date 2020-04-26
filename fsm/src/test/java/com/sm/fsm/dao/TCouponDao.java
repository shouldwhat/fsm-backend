package com.sm.fsm.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.fsm.TAbstractDao;
import com.sm.fsm.domain.coupon.dao.CouponDao;
import com.sm.fsm.model.entity.Coupon;
import com.sm.fsm.model.entity.enumeration.CouponType;

@TestMethodOrder(OrderAnnotation.class)
public class TCouponDao extends TAbstractDao {
	
	@Autowired
	private CouponDao couponDao;
	
	@Test
	@Order(1)
	public void save() {
		
		String accountId = "4ef73765-b839-41c0-a460-b2d2c280e93f";
		
		Coupon coupon = Coupon.builder()
				.accountId(accountId)
				.discount("100")
				.expireTime(LocalDateTime.now().plusDays(1))
				.name("쿠폰이름")
				.startTime(LocalDateTime.now())
				.type(CouponType.PERCENTAGE)
				.build();
		
		couponDao.save(coupon);
	}

	@Test
	@Order(2)
	public void findAll() {
		List<Coupon> findAll = couponDao.findAll();
		LOG.debug("findAll => [{}]", findAll);
		
	}
}
