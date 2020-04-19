package com.sm.fsm.domain.account.paymentOption.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.model.domain.PaymentOptionType;
import com.sm.fsm.model.reqdto.PaymentOptionInsertDto;
import com.sm.fsm.model.reqdto.PaymentOptionUpdateDto;
import com.sm.fsm.model.reqdto.PaymentOptionWithdrawDto;

@RestController
public class PaymentOptionController {

	@GetMapping("/users/{userId}/payment-options")
	public void list(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@GetMapping("/users/{userId}/payment-options/{paymentOptionId}")
	public void get(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String paymentOptionId) {
		
	}
	@DeleteMapping("/users/{userId}/payment-options/{paymentOptionId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String paymentOptionId) {
		
	}
	@PostMapping("/users/{userId}/payment-options")
	public void insert(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody PaymentOptionInsertDto body) {
		
	}
	@PatchMapping("/users/{userId}/payment-options/{paymentOptionId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String paymentOptionId,
			@RequestBody PaymentOptionUpdateDto body) {
		
	}
	@PatchMapping("/users/{userId}/payment-options/{paymentOptionId}/withdraw")
	public void withdraw(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String paymentOptionId,
			@PathVariable PaymentOptionWithdrawDto body) {
		
	}
}
