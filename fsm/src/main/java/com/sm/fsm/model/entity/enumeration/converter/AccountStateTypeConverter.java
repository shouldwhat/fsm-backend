package com.sm.fsm.model.entity.enumeration.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.sm.fsm.model.entity.enumeration.AccountStateType;

@Converter
public class AccountStateTypeConverter implements AttributeConverter<AccountStateType, String> {

	@Override
	public String convertToDatabaseColumn(AccountStateType type) {
		return type.name();
	}

	@Override
	public AccountStateType convertToEntityAttribute(String dbData) {
		return AccountStateType.valueOf(dbData);
	}

}
