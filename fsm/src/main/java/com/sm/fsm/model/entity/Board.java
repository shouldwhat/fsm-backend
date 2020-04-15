package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Entity(name = "tm_board")
public class Board extends AbstractEntity {

	@Column(name = "ACCOUNT_ID")
	private String accountId;
	
	@OneToMany
	@JoinColumn(name = "BOARD_ID")
	private List<BoardAttachmentFile> attachmentFiles; 
	
	@OneToMany
	@JoinColumn(name = "BOARD_ID")
	private List<Comment> comments;
}
