package com.sm.fsm.model.domain;

import com.sm.fsm.model.reqdto.CommentInsertDto;
import com.sm.fsm.model.reqdto.CommentUpdateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class Comment extends AbstractDomain {

	private String userId;
	private String questionId;
	private String commentId;
	private String content;
	
	public static Comment from(String userId, String questionId, CommentInsertDto dto) {
		return Comment.builder()
				.userId(userId)
				.questionId(questionId)
				.content(dto.getContent())
				.build();
	}
	
	public static Comment from(String userId, String questionId, String commentId, CommentUpdateDto dto) {
		return Comment.builder()
				.userId(userId)
				.questionId(questionId)
				.commentId(commentId)
				.content(dto.getContent())
				.build();
	}
}
