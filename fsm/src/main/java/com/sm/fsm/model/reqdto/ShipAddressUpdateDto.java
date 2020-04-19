package com.sm.fsm.model.reqdto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ShipAddressUpdateDto extends AbstractRequestDto {

	private String name;
	private String address;
	private String phone;
}
