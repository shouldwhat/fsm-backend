package com.sm.fsm.model.entity;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

import com.sm.fsm.model.entity.enumeration.PaymentOptionType;
import com.sm.fsm.model.entity.enumeration.converter.PaymentOptionTypeConverter;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_payment_option")
public class PaymentOption extends AbstractEntity {

	private String displayName;
	private String name;
	private String number;
	private String cvc;
	private String validTime;
	private String password;
	
	@Convert(converter = PaymentOptionTypeConverter.class)
	private PaymentOptionType type;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;
}
