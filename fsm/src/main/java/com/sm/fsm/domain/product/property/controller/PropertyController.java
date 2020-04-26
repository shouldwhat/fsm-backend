package com.sm.fsm.domain.product.property.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminProductPropertyController")
public class PropertyController {

	@GetMapping("/admin/{adminId}/product-properties")
	public void list() {
		
	}
}
