package com.sm.fsm.model.reqdto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class ShoppingListSearchDto extends AbstractRequestDto {

	private String userId;
	
	public static ShoppingListSearchDto from(String userId, ShoppingListSearchDto dto) {
		return ShoppingListSearchDto.builder()
				.userId(userId)
				.build();
	}
}
