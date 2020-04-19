package com.sm.fsm.domain.account.paymentOption.service;

import com.sm.fsm.model.domain.PaymentOption;
import com.sm.fsm.model.reqdto.PaymentOptionSearchDto;

public interface PaymentOptionService {
	public void list(PaymentOptionSearchDto search);
	public void get(PaymentOption paymentOption);
	public void delete(PaymentOption paymentOption);
	public void insert(PaymentOption paymentOption);
	public void update(PaymentOption paymentOption);
	public void withdraw(PaymentOption paymentOption);
}
