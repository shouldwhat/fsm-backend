package com.sm.fsm.domain.coupon.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponController {

	@GetMapping("/users/{userId}/coupons")
	public void list(HttpServletRequest reques,
			@PathVariable String userId) {
		
	}
}
