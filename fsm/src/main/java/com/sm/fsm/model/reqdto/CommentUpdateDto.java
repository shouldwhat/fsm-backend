package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CommentUpdateDto extends AbstractRequestDto {

	private String content;
}
