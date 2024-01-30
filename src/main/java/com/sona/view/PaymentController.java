package com.sona.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sona.biz.dto.PaymentVO;
import com.sona.biz.payment.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value="/reservation_detail", method = RequestMethod.GET)
	public String reservationDetailPayment(PaymentVO vo, Model model) {
		List<PaymentVO> payment = paymentService.getListPaymentByRseq(vo);
		model.addAttribute("paymentVO", payment);
		return "payment/reservationDetail";
	}
}
