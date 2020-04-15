package com.sm.fsm.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.Board;

@Repository
public interface BoardDao extends JpaRepository<Board, String> {

}
