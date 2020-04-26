package com.sm.fsm.domain.account.account.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminAccountController")
public class AccountController {

	@GetMapping("/admin/{adminId}/users")
	public void list(HttpServletRequest reques,
			@PathVariable String adminId) {
		
	}
	
	@GetMapping("/admin/{adminId}/users/{userId}")
	public void get(HttpServletRequest reques,
			@PathVariable String adminId,
			@PathVariable String userId) {
		
	}
	
	@PatchMapping("/admin/{adminId}/users/{userId}")
	public void update(HttpServletRequest reques,
			@PathVariable String adminId,
			@PathVariable String userId) {
		
	}
}
