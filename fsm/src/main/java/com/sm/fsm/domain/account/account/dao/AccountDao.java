package com.sm.fsm.domain.account.account.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, String> {

}
