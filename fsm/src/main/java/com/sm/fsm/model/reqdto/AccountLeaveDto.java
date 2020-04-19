package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AccountLeaveDto extends AbstractRequestDto {

	private String password;
}
