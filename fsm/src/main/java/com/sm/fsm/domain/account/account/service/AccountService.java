package com.sm.fsm.domain.account.account.service;

import com.sm.fsm.model.domain.Account;

public interface AccountService {
	public void getSummary(Account account);
	public void getMileage(Account account);
	public void get(Account account);
	public void update(Account account);
	public void updatePassword(Account account);
	public void leave(Account account);
}
