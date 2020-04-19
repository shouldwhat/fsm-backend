package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PaymentOptionUpdateDto extends AbstractRequestDto {

	private String displayName;
}
