package com.sm.fsm.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_product_review")
public class ProductReview extends AbstractEntity {

	private String title;
	private String content;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;
}
