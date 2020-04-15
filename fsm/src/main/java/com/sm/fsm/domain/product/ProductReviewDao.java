package com.sm.fsm.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.ProductReview;

@Repository
public interface ProductReviewDao extends JpaRepository<ProductReview, String> {

}
