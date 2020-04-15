package com.sm.fsm.model.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tr_product_property")
public class ProductPropertyTr extends AbstractEntity {

	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_PROPERTY_ID")
	private ProductProperty productProperty;
}
