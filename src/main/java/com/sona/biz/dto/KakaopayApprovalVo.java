package com.sona.biz.dto;

import java.util.Date;

import lombok.Data;

@Data
public class KakaopayApprovalVo {
	
	private String aid; // ��û ���� ��ȣ
	private String tid; // ���� ���� ��ȣ
	private String cid; // ������ �ڵ�
	private String partner_order_id; // ������ �ֹ���ȣ
	private String partner_user_id; // ������ ȸ�� id
	private String payment_method_type; // ���� ����
	private AmountVO amount; // ���� �ݾ� ����
	private String item_name; // ��ǰ �̸�
	private String item_code; // ��ǰ �ڵ�
	private int quantity; // ��ǰ ����
	private Date created_at; // ���� �غ� ��û �ð�
	private Date approved_at; // ���� ���� �ð�
	
}
