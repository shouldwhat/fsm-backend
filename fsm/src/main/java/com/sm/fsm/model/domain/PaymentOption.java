package com.sm.fsm.model.domain;

import com.sm.fsm.model.entity.enumeration.PaymentOptionType;
import com.sm.fsm.model.reqdto.PaymentOptionInsertDto;
import com.sm.fsm.model.reqdto.PaymentOptionUpdateDto;
import com.sm.fsm.model.reqdto.PaymentOptionWithdrawDto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class PaymentOption extends AbstractDomain {

	private String id;
	private String userId;
	private String name;
	private String displayName;
	private String number;
	private String cvc;
	private String password;
	private String validTime;
	private PaymentOptionType type;
	private int amount;
	
	public static PaymentOption from(String userId, PaymentOptionInsertDto dto) {
		return PaymentOption.builder()
				.userId(userId)
				.name(dto.getName())
				.displayName(dto.getDisplayName())
				.number(dto.getNumber())
				.cvc(dto.getCvc())
				.password(dto.getPassword())
				.validTime(dto.getValidTime())
				.type(dto.getType())
				.build();
	}
	
	public static PaymentOption from(String userId, String id, PaymentOptionUpdateDto dto) {
		return PaymentOption.builder()
				.userId(userId)
				.id(id)
				.displayName(dto.getDisplayName())
				.build();
	}
	
	public static PaymentOption from(String userId, String id, PaymentOptionWithdrawDto dto) {
		return PaymentOption.builder()
				.userId(userId)
				.id(id)
				.amount(dto.getAmount())
				.build();
	}
}
