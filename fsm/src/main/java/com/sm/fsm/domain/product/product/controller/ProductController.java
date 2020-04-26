package com.sm.fsm.domain.product.product.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/products")
	public void list(HttpServletRequest reques) {
		
	}
	
	@GetMapping("/products/{productId}/recommend-products")
	public void listRecomended(HttpServletRequest reques,
			@PathVariable String productId) {
		
	}
	
	@GetMapping("/products/{productId}")
	public void get(HttpServletRequest reques,
			@PathVariable String productId) {
		
	}
}
