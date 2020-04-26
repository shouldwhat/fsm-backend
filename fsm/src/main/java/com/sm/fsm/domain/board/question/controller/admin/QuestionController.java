package com.sm.fsm.domain.board.question.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminQuestionController")
public class QuestionController {

	@GetMapping("/admin/{adminId}/questions")
	public void list(HttpServletRequest request,
			@PathVariable String adminId) {
		
	}
	
	@GetMapping("/admin/{adminId}/questions/{questionId}")
	public void get(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String questionId) {
		
	}
	
	@DeleteMapping("/admin/{adminId}/questions/{questionId}")
	public void delete(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String questionId) {
		
	}
}
