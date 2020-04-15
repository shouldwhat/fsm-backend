package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "tm_board")
public class Board extends AbstractEntity {

	@OneToMany
	@JoinColumn(name = "BOARD_ID")
	private List<BoardAttachmentFile> attachmentFiles; 
	
	@OneToMany
	@JoinColumn(name = "BOARD_ID")
	private List<Comment> comments;
}
