package com.sona.biz.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PaymentVO {

	private int pseq; // 결제번호
	private Date payment_date; // 결제 일자
	private String payment_method; // 결제 수단
	
	// reservation
	private int rseq;
	private int amount; // 결제금액
	private String name; // 예약자 이름
	private int phone_number; // 예약자 전화번호
	private String email; // 예약자 이메일
		
}
