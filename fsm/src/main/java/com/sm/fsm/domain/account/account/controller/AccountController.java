package com.sm.fsm.domain.account.account.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.domain.account.account.service.AccountService;
import com.sm.fsm.model.domain.Account;
import com.sm.fsm.model.reqdto.AccountLeaveDto;
import com.sm.fsm.model.reqdto.AccountUpdateDto;
import com.sm.fsm.model.reqdto.AccountUpdatePasswordDto;

@RestController
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping("/users/{userId}")
	public void get(HttpServletRequest request,
			@PathVariable String userId) {
		accountService.get(Account.builder()
				.userId(userId)
				.build());
	}
	@GetMapping("/users/{userId}/summary")
	public void getSummary(HttpServletRequest request,
			@PathVariable String userId) {
		accountService.getSummary(Account.builder()
				.userId(userId)
				.build());
		
	}
	@GetMapping("/users/{userId}/mileage")
	public void getMileage(HttpServletRequest request,
			@PathVariable String userId) {
		accountService.getMileage(Account.builder()
				.userId(userId)
				.build());
	}
	@PatchMapping("/users/{userId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody AccountUpdateDto body) {
		accountService.update(Account.from(userId, body));
	}
	@PatchMapping("/users/{userId}/password")
	public void updatePassword(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody AccountUpdatePasswordDto body) {
		accountService.updatePassword(Account.from(userId, body));
	}
	@PatchMapping("/users/{userId}/leave")
	public void leave(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody AccountLeaveDto body) {
		accountService.leave(Account.from(userId, body));
	}
}
