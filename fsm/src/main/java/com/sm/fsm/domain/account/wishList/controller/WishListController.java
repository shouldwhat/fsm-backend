package com.sm.fsm.domain.account.wishList.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishListController {

	@GetMapping("/users/{userId}/wish-list")
	public void list(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@DeleteMapping("/users/{userId}/wish-list/{wishListId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String wishListId) {
		
	}
}
