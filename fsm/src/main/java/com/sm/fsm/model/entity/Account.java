package com.sm.fsm.model.entity;

import java.util.List;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.sm.fsm.model.entity.enumeration.AccountStateType;
import com.sm.fsm.model.entity.enumeration.converter.AccountStateTypeConverter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(callSuper = true)
@Getter
@Entity(name = "tm_account")
public class Account extends AbstractEntity {

	private String code;
	private String email;
	private String password;
	private String name;
	private String phone;
	private String birthday;
	private String recomenderCode;
	private String freeMileage;
	private String paidMileage;
	
	@Convert(converter = AccountStateTypeConverter.class)
	private AccountStateType state;
	
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
	
	@Builder
	public Account(String id) {
		this.id = id;
	}
}
