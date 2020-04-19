package com.sm.fsm.model.domain;

public enum PaymentOptionType {

	CARD("card"),
	ACCOUNT("account"),
	;
	
	private String name;
	PaymentOptionType(String name) {
		this.name = name;
	}
	public static PaymentOptionType from(String name) {
		return PaymentOptionType.valueOf(name.toUpperCase());
	}
}
