package com.sm.fsm.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.fsm.TAbstractDao;
import com.sm.fsm.domain.product.property.dao.ProductPropertyDao;
import com.sm.fsm.model.entity.ProductProperty;

public class TProductPropertyDao extends TAbstractDao {

	@Autowired
	private ProductPropertyDao productPropertyDao;
	
	@Test
	public void save() {
		
		ProductProperty pp = ProductProperty.builder()
				.build();
		
		productPropertyDao.save(pp);
		LOG.debug("pp => {}", pp);
	}
}
