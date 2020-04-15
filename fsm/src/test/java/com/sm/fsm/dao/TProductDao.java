package com.sm.fsm.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.fsm.TAbstractDao;
import com.sm.fsm.domain.product.ProductDao;
import com.sm.fsm.model.entity.Product;

public class TProductDao extends TAbstractDao {
	
	@Autowired
	private ProductDao productDao;

//	@Test
	public void save() {
		
		Product product = Product.builder().build();
		productDao.save(product);
		
		LOG.debug("product => {}", product);
	}
	
	@Test
	@Transactional
	public void findOne() {
		
		String id = "3bf46def-6b3b-40ca-a6d8-ff10efc5450d";
//		Product product = Product.builder().id(id).build();
		Optional<Product> productOrEmpty = productDao.findById(id);
		if(productOrEmpty.isPresent()) {
			LOG.debug("product => {}", productOrEmpty.get());
		}
	}
}
