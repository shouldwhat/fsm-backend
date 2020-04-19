package com.sm.fsm.domain.account.qna.question.service;

import com.sm.fsm.model.domain.Question;
import com.sm.fsm.model.reqdto.QuestionSearchDto;

public interface QuestionService {
	public void list(QuestionSearchDto search);
	public void insert(Question question);
	public void update(Question question);
	public void get(Question question);
	public void delete(Question question);
}
