package com.sona.biz.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sona.biz.dao.PaymentDAO;
import com.sona.biz.dto.PaymentVO;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentDAO paymentDao;
	
	@Override
	public List<PaymentVO> getListPaymentByRseq(PaymentVO vo) {
		return paymentDao.ListPaymentByRseq(vo);
	}
	
	@Override
	public void insertPayment(PaymentVO vo) {
		paymentDao.insertPayment(vo);
	}
	
}
