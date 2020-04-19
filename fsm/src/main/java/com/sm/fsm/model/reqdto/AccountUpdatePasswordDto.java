package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AccountUpdatePasswordDto {

	private String password;
	private String newPassword;
}
