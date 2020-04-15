package com.sm.fsm.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.fsm.TAbstractDao;
import com.sm.fsm.domain.account.AccountDao;
import com.sm.fsm.model.entity.Account;

public class TAccountDao extends TAbstractDao {
	
	@Autowired
	private AccountDao accountDao;
	
//	@Test
	public void save() {
		
		Account account = Account.builder()
				.build();

		accountDao.save(account);
		LOG.debug("account => {}", account);
	}
	
	@Test
	@Transactional
	public void findOne() {
		
		String id = "fd523355-cc78-4ab5-a45b-3644405da7a2";
		
		Optional<Account> account = accountDao.findById(id);
		if(account.isPresent()) {
			LOG.debug("account => {}", account.get());
		}
	}
}
