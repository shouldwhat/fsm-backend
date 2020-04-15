package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "tm_product")
public class Product extends AbstractEntity {

	@OneToMany
	@JoinColumn(name = "PRODUCT_ID")
	private List<ProductReview> proudctReviews;
	
	
	@OneToMany(mappedBy = "product")
	private List<ProductPropertyTr> productPropertyTr;
}
