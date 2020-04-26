package com.sm.fsm.domain.account.wishList.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.domain.account.wishList.service.WishListService;
import com.sm.fsm.model.domain.WishList;

@RestController
public class WishListController {

	@Autowired
	private WishListService wishListService;
	
	@GetMapping("/users/{userId}/wish-list")
	public void list(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@DeleteMapping("/users/{userId}/wish-list/{wishListId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String wishListId) {
		wishListService.delete(WishList.builder()
				.userId(userId)
				.id(wishListId)
				.build());
	}
}
