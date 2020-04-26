package com.sm.fsm.model.entity.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStateType {

	WAIT_DEPOSIT,		// 입금 대기
	COMPLETE_DEPOSIT,	// 결제 완료
	PREPARE_SHIPPING,	// 배송 준
	SHIPPING,			// 배송 중
	COMPLETE_SHIPPING,	// 배송 완료
	COMPLETE_PURCHASE,	// 구매 확정
	REQUEST_EXCHANGE,	// 교환 요청
	REQUEST_REFUND,		// 환불 요청
	COMPLETE_REFUND,	// 환불 완료
	HOLD				// 보류
	;
}
