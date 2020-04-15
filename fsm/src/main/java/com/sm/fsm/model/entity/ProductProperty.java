package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

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

	@OneToMany(mappedBy = "productProperty")
	private List<ProductPropertyTr> products;
	
	@Builder
	public ProductProperty(String id) {
		this.id = id;
	}
}
