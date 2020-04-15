package com.sm.fsm.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "productProperty")
@Getter
@Entity(name = "tr_product_property")
public class ProductPropertyTr extends AbstractEntity {

	@Column(name = "PRODUCT_ID")
	private String productId;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT_PROPERTY_ID")
	private ProductProperty productProperty;
	
	@Builder
	public ProductPropertyTr(String productId, String propertyId) {
		this.productId = productId;
		this.productProperty = ProductProperty.builder().id(propertyId).build();
	}
}
