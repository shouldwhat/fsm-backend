package com.sm.fsm.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_payment_option")
public class PaymentOption extends AbstractEntity {

	@Column(name = "ACCOUNT_ID")
	private String accountId;
}
