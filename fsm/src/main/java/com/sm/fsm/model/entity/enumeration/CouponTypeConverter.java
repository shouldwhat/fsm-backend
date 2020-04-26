package com.sm.fsm.model.entity.enumeration;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class CouponTypeConverter implements AttributeConverter<CouponType, String>{

	@Override
	public String convertToDatabaseColumn(CouponType type) {
		return type.name();
	}

	@Override
	public CouponType convertToEntityAttribute(String dbData) {
		return CouponType.valueOf(dbData);
	}
}
