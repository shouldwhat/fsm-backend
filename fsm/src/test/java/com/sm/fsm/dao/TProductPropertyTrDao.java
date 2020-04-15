package com.sm.fsm.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.fsm.TAbstractDao;
import com.sm.fsm.domain.product.ProductPropertyTrDao;
import com.sm.fsm.model.entity.ProductPropertyTr;

public class TProductPropertyTrDao extends TAbstractDao {

	@Autowired
	private ProductPropertyTrDao productPropertyTrDao;
	
	@Test
	public void save() {
		
		String productId = "3bf46def-6b3b-40ca-a6d8-ff10efc5450d";
		String propertyId = "295b0352-2a8a-4a9d-9bab-d93c309bfcba";
		
		ProductPropertyTr pptr = ProductPropertyTr.builder()
				.productId(productId)
				.propertyId(propertyId)
				.build();
		
		productPropertyTrDao.save(pptr);
		LOG.debug("pptr => {}", pptr);
	}
}
