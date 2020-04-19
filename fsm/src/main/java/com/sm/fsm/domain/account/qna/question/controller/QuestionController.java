package com.sm.fsm.domain.account.qna.question.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.model.reqdto.QuestionInsertDto;
import com.sm.fsm.model.reqdto.QuestionUpdateDto;

@RestController
public class QuestionController {

	@GetMapping("/users/{userId}/questions")
	public void list(HttpServletRequest request,
			@PathVariable String userId) {
		
	}
	@PostMapping("/users/{userId}/questions")
	public void insert(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody QuestionInsertDto body) {
		
	}
	@PatchMapping("/users/{userId}/questions/{questionId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId,
			@RequestBody QuestionUpdateDto body) {
		
	}
	@GetMapping("/users/{userId}/questions/{questionId}")
	public void get(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId) {
		
	}
	@DeleteMapping("/users/{userId}/questions/{questionId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId) {
		
	}
}
