package com.sm.fsm.domain.account.qna.comment.service;

import com.sm.fsm.model.domain.Comment;
import com.sm.fsm.model.reqdto.CommentSearchDto;

public interface CommentService {
	public void list(CommentSearchDto search);
	public void insert(Comment comment);
	public void update(Comment comment);
	public void delete(Comment comment);
}
