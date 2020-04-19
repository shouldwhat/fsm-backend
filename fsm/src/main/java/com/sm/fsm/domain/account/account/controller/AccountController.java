package com.sm.fsm.domain.account.account.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.model.reqdto.AccountLeaveDto;
import com.sm.fsm.model.reqdto.AccountUpdateDto;
import com.sm.fsm.model.reqdto.AccountUpdatePasswordDto;

@RestController
public class AccountController {

	
	@GetMapping("/users/{userId}")
	public void get(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@GetMapping("/users/{userId}/summary")
	public void getSummary(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@GetMapping("/users/{userId}/mileage")
	public void getMileage(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@PatchMapping("/users/{userId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody AccountUpdateDto body) {
		
	}
	@PatchMapping("/users/{userId}/password")
	public void updatePassword(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody AccountUpdatePasswordDto body) {
		
	}
	@PatchMapping("/users/{userId}/leave")
	public void leave(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody AccountLeaveDto body) {
		
	}
}
