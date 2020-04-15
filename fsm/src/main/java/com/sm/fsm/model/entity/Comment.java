package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_comment")
public class Comment extends AbstractEntity {

	@Column(name = "ACCOUNT_ID")
	private String accountId;
	
	@OneToMany
	@JoinColumn(name = "COMMENT_ID")
	private List<CommentAttachmentFile> attachmentFiles;
}
