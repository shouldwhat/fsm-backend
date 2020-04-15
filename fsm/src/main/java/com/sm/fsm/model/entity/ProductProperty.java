package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity(name = "tm_product_property")
public class ProductProperty extends AbstractEntity {

	@OneToMany(mappedBy = "productProperty")
	private List<ProductPropertyTr> products;
}
