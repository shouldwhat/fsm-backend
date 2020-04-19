package com.sm.fsm.model.domain;

import com.sm.fsm.model.reqdto.AccountLeaveDto;
import com.sm.fsm.model.reqdto.AccountUpdateDto;
import com.sm.fsm.model.reqdto.AccountUpdatePasswordDto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class Account extends AbstractDomain {

	private String userId;
	private String name;
	private String phone;
	private String birthday;
	private String password;
	private String newPassword;

	public static Account from(String userId, AccountUpdateDto dto) {
		return Account.builder()
				.userId(userId)
				.name(dto.getName())
				.birthday(dto.getBirthday())
				.phone(dto.getPhone()).build();
	}
	
	public static Account from(String userId, AccountUpdatePasswordDto dto) {
		return Account.builder()
				.userId(userId)
				.password(dto.getPassword())
				.newPassword(dto.getNewPassword())
				.build();
	}
	
	public static Account from(String userId, AccountLeaveDto dto) {
		return Account.builder()
				.userId(userId)
				.password(dto.getPassword())
				.build();
	}
	
}
