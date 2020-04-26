package com.sm.fsm.model.entity.enumeration.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.sm.fsm.model.entity.enumeration.PaymentOptionType;

@Converter
public class PaymentOptionTypeConverter implements AttributeConverter<PaymentOptionType, String>{

	@Override
	public String convertToDatabaseColumn(PaymentOptionType type) {
		return type.name();
	}

	@Override
	public PaymentOptionType convertToEntityAttribute(String dbData) {
		return PaymentOptionType.valueOf(dbData);
	}

}
