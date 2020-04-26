package com.sm.fsm.domain.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, String> {

}
