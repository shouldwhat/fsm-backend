package com.sm.fsm.domain.account.shoppingList.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.ShoppingList;

@Repository
public interface ShoppingListDao extends JpaRepository<ShoppingList, String> {

}
