package com.sm.fsm.domain.account.shoppingList.service;

import com.sm.fsm.model.domain.ShoppingList;
import com.sm.fsm.model.reqdto.ShoppingListSearchDto;

public interface ShoppingListService {
	public void list(ShoppingListSearchDto search);
	public void delete(ShoppingList shoppingList);
	public void update(ShoppingList shoppingList);
}
