package com.sona.biz.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sona.biz.dto.PaymentVO;

@Repository
public class PaymentDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 예약 정보
	public List<PaymentVO> ListPaymentByRseq(PaymentVO vo) {
		return mybatis.selectList("PaymentMapper.getReservationInfo", vo);
	}
	
	// 결제 정보 삽입
	public void insertPayment(PaymentVO vo) {
		mybatis.insert("PaymentMapper.insertPayment", vo);
	}
}
