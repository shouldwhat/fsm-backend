package com.sm.fsm.model.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class WishList extends AbstractDomain {

	private String userId;
	private String id;
}
