package com.sona.biz.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PaymentVO {

	private int pseq; // ������ȣ
	private Date payment_date; // ���� ����
	private String payment_method; // ���� ����
	
	// reservation
	private int rseq;
	private int amount; // �����ݾ�
	private String name; // ������ �̸�
	private int phone_number; // ������ ��ȭ��ȣ
	private String email; // ������ �̸���
		
}
