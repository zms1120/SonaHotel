package com.sona.biz.dto;

import lombok.Data;

@Data
public class ReservationVO {

	private int rseq; // 예약번호
	private int amount; // 결제금액
	private String name; // 예약자 이름
	private int phone_number; // 예약자 전화번호
	
}
