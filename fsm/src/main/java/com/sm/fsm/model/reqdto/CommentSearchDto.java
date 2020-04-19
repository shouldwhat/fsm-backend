package com.sm.fsm.model.reqdto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class CommentSearchDto extends AbstractRequestDto {

	private String userId;
	private String questionId;
	
	public static CommentSearchDto from(String userId, String questionId, CommentSearchDto dto) {
		return CommentSearchDto.builder()
				.userId(userId)
				.questionId(questionId)
				.build();
	}
}
