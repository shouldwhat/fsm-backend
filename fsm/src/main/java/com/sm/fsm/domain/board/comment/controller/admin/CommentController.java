package com.sm.fsm.domain.board.comment.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("adminCommentController")
public class CommentController {

	@GetMapping("/admin/{adminId}/questions/{questionId}/comments")
	public void list(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String questionId) {
		
	}
	
	@PostMapping("/admin/{adminId}/questions/{questionId}/comments")
	public void insert(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String questionId) {
		
	}
	
	@PatchMapping("/admin/{adminId}/questions/{questionId}/comments/{commentId}")
	public void update(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String questionId,
			@PathVariable String commentId) {
		
	}
	
	@DeleteMapping("/admin/{adminId}/questions/{questionId}/comments/{commentId}")
	public void delete(HttpServletRequest request,
			@PathVariable String adminId,
			@PathVariable String questionId,
			@PathVariable String commentId) {
		
	}
}
