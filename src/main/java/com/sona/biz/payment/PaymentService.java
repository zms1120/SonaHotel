package com.sona.biz.payment;

import java.util.List;

import com.sona.biz.dto.PaymentVO;

public interface PaymentService {

	// ���� ����
	List<PaymentVO> getListPaymentByRseq(PaymentVO vo);
	
	// ���� ���� ����
	void insertPayment(PaymentVO vo);

}