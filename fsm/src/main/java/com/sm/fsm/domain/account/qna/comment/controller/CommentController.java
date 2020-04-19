package com.sm.fsm.domain.account.qna.comment.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.domain.account.qna.comment.service.CommentService;
import com.sm.fsm.model.domain.Comment;
import com.sm.fsm.model.reqdto.CommentInsertDto;
import com.sm.fsm.model.reqdto.CommentSearchDto;
import com.sm.fsm.model.reqdto.CommentUpdateDto;

@RestController
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@GetMapping("/users/{userId}/questions/{questionId}/comments")
	public void list(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId,
			CommentSearchDto query) {
		commentService.list(CommentSearchDto.from(userId, questionId, query));
	}
	@PostMapping("/users/{userId}/questions/{questionId}/comments")
	public void insert(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId,
			@RequestBody CommentInsertDto body) {
		commentService.insert(Comment.from(userId, questionId, body));
	}
	@PatchMapping("/users/{userId}/questions/{questionId}/comments/{commentId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId,
			@PathVariable String commentId,
			@RequestBody CommentUpdateDto body) {
		commentService.update(Comment.from(userId, questionId, commentId, body));
	}
	@DeleteMapping("/users/{userId}/questions/{questionId}/comments/{commentId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String questionId,
			@PathVariable String commentId) {
		commentService.update(Comment.builder()
				.userId(userId)
				.questionId(questionId)
				.commentId(commentId)
				.build());
	}
}
