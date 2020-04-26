package com.sm.fsm.domain.board.notice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

	@GetMapping("/notices")
	public void list(HttpServletRequest request) {
		
	}
	
	@GetMapping("/notices/{noticeId}")
	public void get(HttpServletRequest reques,
			@PathVariable String noticeId) {
		
	}
	
	@PostMapping("/notices")
	public void insert(HttpServletRequest reques) {
		
	}
	
	@PatchMapping("/notices/{noticeId}")
	public void update(HttpServletRequest reques,
			@PathVariable String noticeId) {
		
	}
	
	@DeleteMapping("/notices/{noticeId}")
	public void delete(HttpServletRequest reques,
			@PathVariable String noticeId) {
		
	}
}
