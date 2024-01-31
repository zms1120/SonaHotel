package com.sona.biz.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PaymentVO {

	private int pseq; // 주문번호(partner_order_id)
	private Date payment_date; // 결제 일자
	private String payment_method; // 결제 수단
	
	// ReservationVO
	private int rseq; // 
	private int amount; // 결제금액(total_amount)
	private String name; // 예약자 이름(partner_user_id)
	private int phone_number; // 예약자 전화번호
	
}
