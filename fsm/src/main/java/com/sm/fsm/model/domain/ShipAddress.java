package com.sm.fsm.model.domain;

import com.sm.fsm.model.reqdto.ShipAddressInsertDto;
import com.sm.fsm.model.reqdto.ShipAddressUpdateDto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class ShipAddress extends AbstractDomain {

	private String userId;
	private String address;
	private String name;
	private String phone;
	
	public static ShipAddress from(String userId, ShipAddressInsertDto dto) {
		return ShipAddress.builder()
				.userId(userId)
				.address(dto.getAddress())
				.name(dto.getName())
				.phone(dto.getPhone())
				.build();
	}
	
	public static ShipAddress from(String userId, ShipAddressUpdateDto dto) {
		return ShipAddress.builder()
				.userId(userId)
				.name(dto.getName())
				.phone(dto.getPhone())
				.build();
	}
}
