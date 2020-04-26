package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.sm.fsm.model.entity.enumeration.ProductPropertyType;
import com.sm.fsm.model.entity.enumeration.converter.ProductPropertyTypeConverter;

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
@Entity(name = "tm_product_property")
public class ProductProperty extends AbstractEntity {

	private String name;
	private int displaySeq;
	
	@Convert(converter = ProductPropertyTypeConverter.class)
	private ProductPropertyType type;
	
	@OneToMany(mappedBy = "productProperty")
	private List<ProductPropertyTr> products;
	
	@Builder
	public ProductProperty(String id) {
		this.id = id;
	}
}
