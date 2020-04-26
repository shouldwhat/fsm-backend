package com.sm.fsm.domain.order.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminOrderController")
public class OrderController {

	@GetMapping("/admin/{adminId}/orders")
	public void list(HttpServletRequest request,
			@PathVariable String adminId) {
		
	}
	
	@GetMapping("/admin/{adminId}/orders/{orderId}")
	public void get(HttpServletRequest request,
			@PathVariable String adminId) {
		
	}
	
	@PatchMapping("/admin/{adminId}/orders/{orderId}")
	public void update(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String orderId) {
		
	}
	
	@PatchMapping("/admin/{adminId}/orders/{orderId}/invoice-numbers")
	public void updateInvoiceNumber(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String orderId) {
		
	}
	
	@PostMapping("/admin/{adminId}/orders/{orderId}/invoice-numbers")
	public void insertInvoiceNumber(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String orderId) {
		
	}
}
