package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AccountUpdateDto extends AbstractRequestDto {

	private String name;
	private String phone;
	private String birthday;
}
