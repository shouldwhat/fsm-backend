package com.sm.fsm.model.reqdto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class ShipAddressSearchDto extends AbstractRequestDto {

	private String userId;
	
	public static ShipAddressSearchDto from(String userId, ShipAddressSearchDto dto) {
		return ShipAddressSearchDto.builder()
				.userId(userId)
				.build();
	}
}
