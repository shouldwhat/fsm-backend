package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_product_property")
public class ProductProperty extends AbstractEntity {

	@OneToMany(mappedBy = "productProperty")
	private List<ProductPropertyTr> products;
}
