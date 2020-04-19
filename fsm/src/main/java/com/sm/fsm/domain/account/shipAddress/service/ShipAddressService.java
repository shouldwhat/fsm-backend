package com.sm.fsm.domain.account.shipAddress.service;

import com.sm.fsm.model.domain.ShipAddress;
import com.sm.fsm.model.reqdto.ShipAddressSearchDto;

public interface ShipAddressService {
	public void list(ShipAddressSearchDto search);
	public void get(ShipAddress shipAddress);
	public void delete(ShipAddress shipAddress);
	public void insert(ShipAddress shipAddress);
	public void update(ShipAddress shipAddress);
}
