package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "tm_order")
public class Order extends AbstractEntity {

	@OneToMany
	@JoinColumn(name = "ORDER_ID")
	private List<OrderHistory> orderHistories;
	
	@OneToMany
	@JoinColumn(name = "ORDER_ID")
	private List<OrderProduct> orderProduct;
}
