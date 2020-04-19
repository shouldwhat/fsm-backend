package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PaymentOptionWithdrawDto extends AbstractRequestDto {

	private int amount;
}
