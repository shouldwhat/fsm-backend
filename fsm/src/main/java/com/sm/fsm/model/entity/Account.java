package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Entity(name = "tm_account")
public class Account extends AbstractEntity {

	@OneToMany// (fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	@JoinColumn(name = "ACCOUNT_ID")
	private List<ShipAddress> shipAddresses;
	
	@OneToMany
	@JoinColumn(name = "ACCOUNT_ID")
	private List<PaymentOption> paymentOptions;
	
	@OneToMany
	@JoinColumn(name = "ACCOUNT_ID")
	private List<Order> orders;
	
	@OneToMany
	@JoinColumn(name = "ACCOUNT_ID")
	private List<ProductReview> productReviews;
	
	@OneToMany
	@JoinColumn(name = "ACCOUNT_ID")
	private List<Coupon> coupons;
	
	@OneToMany
	@JoinColumn(name = "ACCOUNT_ID")
	private List<Board> boards;
	
	@OneToMany
	@JoinColumn(name = "ACCOUNT_ID")
	private List<Comment> comments;
	
	@OneToMany(mappedBy = "account")
	private List<WishList> wishList;
	
	@OneToMany(mappedBy = "account")
	private List<ShoppingList> shoppingList;
}
