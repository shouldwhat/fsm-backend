package com.sm.fsm.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.OrderProduct;

@Repository
public interface OrderProductDao extends JpaRepository<OrderProduct, String> {

}
