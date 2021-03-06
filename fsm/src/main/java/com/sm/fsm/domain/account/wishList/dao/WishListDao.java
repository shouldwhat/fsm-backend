package com.sm.fsm.domain.account.wishList.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.WishList;

@Repository
public interface WishListDao extends JpaRepository<WishList, String> {

}
