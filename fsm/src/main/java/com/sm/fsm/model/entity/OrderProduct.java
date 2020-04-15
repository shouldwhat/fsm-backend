package com.sm.fsm.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tr_order_product")
public class OrderProduct extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "ORDER_ID")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
}
