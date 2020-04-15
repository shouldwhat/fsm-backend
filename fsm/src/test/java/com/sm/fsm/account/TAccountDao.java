package com.sm.fsm.account;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sm.fsm.domain.account.AccountDao;
import com.sm.fsm.model.entity.Account;

@SpringBootTest
public class TAccountDao {
	
	private static final Logger LOG = LoggerFactory.getLogger(TAccountDao.class);
	
	@Autowired
	private AccountDao accountDao;
	
	@Test
	public void save() {
		
		String name = "wonkyu";
		
		Account account = new Account();
		account.setName("wonkyu");
		
		accountDao.save(account);
		LOG.debug("account => {}", account);
	}
	
	public static void main(String[] args) {
		System.out.println("d7d44832-4db8-4230-a1c6-91eaa87f239b".length());
	}
	

}
