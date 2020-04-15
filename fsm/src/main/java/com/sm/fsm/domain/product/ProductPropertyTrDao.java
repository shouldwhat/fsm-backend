package com.sm.fsm.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.ProductPropertyTr;

@Repository
public interface ProductPropertyTrDao extends JpaRepository<ProductPropertyTr, String> {

}
