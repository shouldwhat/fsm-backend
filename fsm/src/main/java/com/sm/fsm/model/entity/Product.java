package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Entity(name = "tm_product")
public class Product extends AbstractEntity {

	@OneToMany
	@JoinColumn(name = "PRODUCT_ID")
	private List<ProductReview> proudctReviews;
	
	
//	@OneToMany(mappedBy = "product")
//	private List<ProductPropertyTr> productPropertyTr;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "PRODUCT_ID")
	private List<ProductPropertyTr> productPropertyTr;
	
	@Builder
	public Product(String id) {
		this.id = id;
	}
}
