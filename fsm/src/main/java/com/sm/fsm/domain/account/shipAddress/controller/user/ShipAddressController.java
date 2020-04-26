package com.sm.fsm.domain.account.shipAddress.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.fsm.domain.account.shipAddress.service.ShipAddressService;
import com.sm.fsm.model.domain.ShipAddress;
import com.sm.fsm.model.reqdto.ShipAddressInsertDto;
import com.sm.fsm.model.reqdto.ShipAddressSearchDto;
import com.sm.fsm.model.reqdto.ShipAddressUpdateDto;

@RestController
public class ShipAddressController {

	@Autowired
	private ShipAddressService shipAddressService;
	
	@GetMapping("/users/{userId}/ship-addresses")
	public void list(HttpServletRequest request,
			@PathVariable String userId,
			ShipAddressSearchDto query) {
		shipAddressService.list(ShipAddressSearchDto.from(userId, query));
	}
	@GetMapping("/users/{userId}/ship-addresses/{shipAddressId}")
	public void get(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String shipAddressId) {
		shipAddressService.get(ShipAddress.builder()
				.userId(userId)
				.id(shipAddressId)
				.build());
	}
	@DeleteMapping("/users/{userId}/ship-addresses/{shipAddressId}")
	public void delete(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String shipAddressId) {
		shipAddressService.delete(ShipAddress.builder()
				.userId(userId)
				.id(shipAddressId)
				.build());
	}
	@PostMapping("/users/{userId}/ship-addresses")
	public void insert(HttpServletRequest request,
			@PathVariable String userId,
			@RequestBody ShipAddressInsertDto body) {
		shipAddressService.insert(ShipAddress.from(userId, body));
	}
	@PatchMapping("/users/{userId}/ship-addresses/{shipAddressId}")
	public void update(HttpServletRequest request,
			@PathVariable String userId,
			@PathVariable String shipAddressId,
			@RequestBody ShipAddressUpdateDto body) {
		shipAddressService.update(ShipAddress.from(userId, shipAddressId, body));
	}
}
