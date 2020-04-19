package com.sm.fsm.domain.account.wishList.service;

import com.sm.fsm.model.domain.WishList;
import com.sm.fsm.model.reqdto.WishListSearchDto;

public interface WishListService {
	public void list(WishListSearchDto search);
	public void delete(WishList wishList);
}
