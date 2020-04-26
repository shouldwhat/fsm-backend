package com.sm.fsm.domain.order.history.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.OrderHistory;

@Repository
public interface OrderHistoryDao extends JpaRepository<OrderHistory, String> {

}
