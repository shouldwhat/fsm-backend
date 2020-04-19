package com.sm.fsm.model.domain;

import com.sm.fsm.model.reqdto.QuestionInsertDto;
import com.sm.fsm.model.reqdto.QuestionUpdateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class Question extends AbstractDomain {

	private String userId;
	private String title;
	private String content;
	
	public static Question from(String userId, QuestionInsertDto dto) {
		return Question.builder()
				.userId(userId)
				.title(dto.getTitle())
				.content(dto.getContent())
				.build();
	}
	
	public static Question from(String userId, QuestionUpdateDto dto) {
		return Question.builder()
				.userId(userId)
				.title(dto.getTitle())
				.content(dto.getContent())
				.build();
	}
}
