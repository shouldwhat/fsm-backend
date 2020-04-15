package com.sm.fsm.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tm_shppinglist")
public class ShoppingList extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "ACCOUNT_ID")
	private Account account;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
}
