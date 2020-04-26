package com.sm.fsm.domain.product.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, String> {

}
