package com.sm.fsm.model.reqdto;

import com.sm.fsm.model.entity.enumeration.PaymentOptionType;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PaymentOptionInsertDto extends AbstractRequestDto {

	private String name;
	private String displayName;
	private String number;
	private String cvc;
	private String password;
	private String validTime;
	private PaymentOptionType type;
	
	public void setType(String type) {
		this.type = PaymentOptionType.valueOf(type);
	}
}
