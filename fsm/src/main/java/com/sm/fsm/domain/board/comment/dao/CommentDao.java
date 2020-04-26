package com.sm.fsm.domain.board.comment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.Comment;

@Repository
public interface CommentDao extends JpaRepository<Comment, String> {

}
