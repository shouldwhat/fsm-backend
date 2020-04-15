package com.sm.fsm.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_wishlist")
public class WishList extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
}
