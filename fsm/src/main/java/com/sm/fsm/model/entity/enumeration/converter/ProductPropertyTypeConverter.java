package com.sm.fsm.model.entity.enumeration.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.sm.fsm.model.entity.enumeration.ProductPropertyType;

@Converter
public class ProductPropertyTypeConverter implements AttributeConverter<ProductPropertyType, String> {

	@Override
	public String convertToDatabaseColumn(ProductPropertyType type) {
		return type.name();
	}

	@Override
	public ProductPropertyType convertToEntityAttribute(String dbData) {
		return ProductPropertyType.valueOf(dbData);
	}

}
