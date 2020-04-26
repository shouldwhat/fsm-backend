package com.sm.fsm.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

import com.sm.fsm.model.entity.enumeration.CouponType;
import com.sm.fsm.model.entity.enumeration.CouponTypeConverter;

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

	private String name;
	private String discount;
	private LocalDateTime startTime;
	private LocalDateTime expireTime;

	@Convert(converter = CouponTypeConverter.class)
	private CouponType type;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;
}
