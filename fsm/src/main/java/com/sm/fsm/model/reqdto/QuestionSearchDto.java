package com.sm.fsm.model.reqdto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class QuestionSearchDto extends AbstractRequestDto {

	private String userId;

	public static QuestionSearchDto from(String userId, QuestionSearchDto dto) {
		return QuestionSearchDto.builder()
				.userId(userId)
				.build();
	}
}
