package com.sm.fsm.domain.product.property.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.ProductProperty;

@Repository
public interface ProductPropertyDao extends JpaRepository<ProductProperty, String> {

}
