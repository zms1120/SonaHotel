package com.sona.biz.payment;

import java.util.List;

import com.sona.biz.dto.PaymentVO;

public interface PaymentService {

	// 예약 정보
	List<PaymentVO> getListPaymentByRseq(PaymentVO vo);
	
	// 결제 정보 삽입
	void insertPayment(PaymentVO vo);

}