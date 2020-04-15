package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "tm_comment")
public class Comment extends AbstractEntity {

	@OneToMany
	@JoinColumn(name = "COMMENT_ID")
	private List<CommentAttachmentFile> attachmentFiles;
}
