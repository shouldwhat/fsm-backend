package com.sm.fsm.domain.account.shoppingList.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.domain.account.shoppingList.service.ShoppingListService;
import com.sm.fsm.model.domain.ShoppingList;
import com.sm.fsm.model.reqdto.ShoppingListSearchDto;

@RestController
public class ShoppingListController {

	@Autowired
	private ShoppingListService shoppingListService;
	
	@GetMapping("/users/{userId}/shopping-lists")
	public void list(HttpServletRequest request,
			@PathVariable String userId,
			ShoppingListSearchDto query) {
		shoppingListService.list(ShoppingListSearchDto.from(userId, query));
	}
	@DeleteMapping("/users/{userId}/shopping-lists/{shoppingListId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String shoppingListId) {
		shoppingListService.delete(ShoppingList.builder()
				.userId(userId)
				.id(shoppingListId)
				.build());
	}
	@PatchMapping("/users/{userId}/shopping-lists/{shoppingListId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String shoppingListId) {
	}
}
