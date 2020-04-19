package com.sm.fsm.model.reqdto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CommentInsertDto extends AbstractRequestDto {

	private String content;
}
