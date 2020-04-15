package com.sm.fsm.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Entity(name = "tm_coupon")
public class Coupon extends AbstractEntity {

	@Column(name = "ACCOUNT_ID")
	private String accountId;
}
