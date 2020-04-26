package com.sm.fsm.domain.product.product.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminProductController")
public class ProductController {

	@GetMapping("/admin/{adminId}/products")
	public void list(HttpServletRequest request,
			@PathVariable String adminId) {
		
	}
	
	@GetMapping("/admin/{adminId}/products/{productId}")
	public void get(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String productId) {
		
	}
	
	@PostMapping("/admin/{adminId}/products")
	public void insert(HttpServletRequest request,
			@PathVariable String adminId) {
		
	}
	
	@PatchMapping("/admin/{adminId}/products/{productId}")
	public void update(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String productId) {
		
	}
	
	@DeleteMapping("/admin/{adminId}/products/{productId}")
	public void delete(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String productId) {
		
	}
}
