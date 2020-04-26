package com.sm.fsm.domain.order.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@PostMapping("/users/{userId}/orders")
	public void order(HttpServletRequest reques,
			@PathVariable String userId) {
		
	}
	
	@GetMapping("/users/{userId}/orders/{orderId}")
	public void get(HttpServletRequest reques,
			@PathVariable String userId,
			@PathVariable String orderId) {
		
	}
	
	@PostMapping("/users/{userId}/orders/{orderId}/pay")
	public void pay(HttpServletRequest reques,
			@PathVariable String userId,
			@PathVariable String orderId) {
		
	}
}
