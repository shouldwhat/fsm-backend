package com.sm.fsm.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_ship_address")
public class ShipAddress extends AbstractEntity {

	private String name;
	private String address;
	private String phone;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;
}
