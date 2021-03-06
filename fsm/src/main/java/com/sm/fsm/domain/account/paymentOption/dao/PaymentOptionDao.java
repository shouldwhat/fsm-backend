package com.sm.fsm.domain.account.paymentOption.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.PaymentOption;

@Repository
public interface PaymentOptionDao extends JpaRepository<PaymentOption, String> {

}
