package com.sm.fsm.model.entity.enumeration.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.sm.fsm.model.entity.enumeration.OrderStateType;

@Converter
public class OrderStateTypeConverter implements AttributeConverter<OrderStateType, String> {

	@Override
	public String convertToDatabaseColumn(OrderStateType type) {
		return type.name();
	}

	@Override
	public OrderStateType convertToEntityAttribute(String dbData) {
		return OrderStateType.valueOf(dbData);
	}

}
