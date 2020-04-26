package com.sm.fsm.model.entity.enumeration.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.sm.fsm.model.entity.enumeration.BoardType;

@Converter
public class BoardTypeConverter implements AttributeConverter<BoardType, String>{

	@Override
	public String convertToDatabaseColumn(BoardType type) {
		return type.name();
	}

	@Override
	public BoardType convertToEntityAttribute(String dbData) {
		return BoardType.valueOf(dbData);
	}
}
