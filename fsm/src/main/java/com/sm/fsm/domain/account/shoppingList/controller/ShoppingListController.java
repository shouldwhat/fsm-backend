package com.sm.fsm.domain.account.shoppingList.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.model.reqdto.ShoppingListUpdateDto;

@RestController
public class ShoppingListController {

	@GetMapping("/users/{userId}/shopping-lists")
	public void list(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@DeleteMapping("/users/{userId}/shopping-lists/{shoppingListId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String shoppingListId) {
		
	}
	@PatchMapping("/users/{userId}/shopping-lists/{shoppingListId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String shoppingListId,
			@RequestBody ShoppingListUpdateDto body) {
		
	}
}
