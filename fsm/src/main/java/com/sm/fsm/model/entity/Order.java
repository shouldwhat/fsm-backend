package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_order")
public class Order extends AbstractEntity {

	@OneToMany
	@JoinColumn(name = "ORDER_ID")
	private List<OrderHistory> orderHistories;
	
	@OneToMany(mappedBy = "order")
	private List<OrderProduct> orderProduct;
	
	@OneToOne
	@JoinColumn(name = "PAYMENT_OPTION_ID")
	private PaymentOption paymentOption;
	
	@OneToOne
	@JoinColumn(name = "SHIP_ADDRESS_ID")
	private ShipAddress shipAddress;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;
}
