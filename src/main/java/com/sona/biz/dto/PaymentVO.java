package com.sona.biz.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PaymentVO {

	private int pseq; // �ֹ���ȣ(partner_order_id)
	private Date payment_date; // ���� ����
	private String payment_method; // ���� ����
	
	// ReservationVO
	private int rseq; // 
	private int amount; // �����ݾ�(total_amount)
	private String name; // ������ �̸�(partner_user_id)
	private int phone_number; // ������ ��ȭ��ȣ
	
}
