package com.sm.fsm.model.entity;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_comment_attachment_file")
public class CommentAttachmentFile extends AbstractEntity {

}
