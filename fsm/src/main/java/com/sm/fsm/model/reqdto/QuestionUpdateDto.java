package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class QuestionUpdateDto extends AbstractRequestDto {

	private String title;
	private String content;
}
