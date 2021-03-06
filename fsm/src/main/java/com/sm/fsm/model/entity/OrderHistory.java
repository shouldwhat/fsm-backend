package com.sm.fsm.model.entity;

import javax.persistence.Convert;
import javax.persistence.Entity;

import com.sm.fsm.model.entity.enumeration.OrderStateType;
import com.sm.fsm.model.entity.enumeration.converter.OrderStateTypeConverter;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_order_history")
public class OrderHistory extends AbstractEntity {

	private String etc;
	
	@Convert(converter = OrderStateTypeConverter.class)
	private OrderStateType state;
}
