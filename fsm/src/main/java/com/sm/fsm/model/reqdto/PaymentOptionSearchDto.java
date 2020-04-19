package com.sm.fsm.model.reqdto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class PaymentOptionSearchDto extends AbstractRequestDto {
	
	private String userId;
	
	public static PaymentOptionSearchDto from(String userId, PaymentOptionSearchDto dto) {
		return PaymentOptionSearchDto.builder()
				.userId(userId)
				.build();
	}
}
