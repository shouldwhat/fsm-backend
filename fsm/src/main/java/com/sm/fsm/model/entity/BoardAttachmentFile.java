package com.sm.fsm.model.entity;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_board_attachment_file")
public class BoardAttachmentFile extends AbstractEntity {

}
