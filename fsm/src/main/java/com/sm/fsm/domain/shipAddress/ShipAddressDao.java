package com.sm.fsm.domain.shipAddress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sm.fsm.model.entity.ShipAddress;

@Repository
public interface ShipAddressDao extends JpaRepository<ShipAddress, String> {

}
