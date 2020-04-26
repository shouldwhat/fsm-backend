package com.sm.fsm.domain.board.question.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.domain.board.question.service.QuestionService;
import com.sm.fsm.model.domain.Question;
import com.sm.fsm.model.reqdto.QuestionInsertDto;
import com.sm.fsm.model.reqdto.QuestionSearchDto;
import com.sm.fsm.model.reqdto.QuestionUpdateDto;

@RestController
public class QuestionController {

	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/users/{userId}/questions")
	public void list(HttpServletRequest request,
			@PathVariable String userId,
			QuestionSearchDto search) {
		questionService.list(QuestionSearchDto.from(userId, search));
		
	}
	@PostMapping("/users/{userId}/questions")
	public void insert(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody QuestionInsertDto body) {
		questionService.insert(Question.from(userId, body));
	}
	@PatchMapping("/users/{userId}/questions/{questionId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId,
			@RequestBody QuestionUpdateDto body) {
		questionService.update(Question.from(userId, questionId, body));
	}
	@GetMapping("/users/{userId}/questions/{questionId}")
	public void get(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId) {
		questionService.get(Question.builder()
				.userId(userId)
				.id(questionId)
				.build());
	}
	@DeleteMapping("/users/{userId}/questions/{questionId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId) {
		questionService.delete(Question.builder()
				.userId(userId)
				.id(questionId)
				.build());
	}
}
