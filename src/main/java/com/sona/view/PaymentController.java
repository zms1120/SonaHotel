package com.sona.view;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sona.biz.dto.KakaopayApprovalVo;
import com.sona.biz.dto.PaymentVO;
import com.sona.biz.payment.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value="/reservation_detail", method = RequestMethod.GET)
	public String reservationDetailPayment(Model model, HttpSession session) {
		
	    PaymentVO vo = new PaymentVO();
	    vo.setRseq(50002);
	    
		List<PaymentVO> payment = paymentService.getListPaymentByRseq(vo);
        
        System.out.println("------------------예약정보-------------");
        System.out.println(payment);
        
        session.setAttribute("paymentInfo", payment);
		model.addAttribute("paymentVO", payment);
		return "payment/reservationDetail";
		
	}
	
	@RequestMapping("/kakaopay")
	@ResponseBody
	public String kakaopay(HttpSession session) {
		try {
			
			@SuppressWarnings("unchecked") // 형변환 경고 무시
			List<PaymentVO> payment = (List<PaymentVO>) session.getAttribute("paymentInfo");
			
			if(payment != null && !payment.isEmpty()) {
				
				PaymentVO paymentInfo = payment.get(0);
				
				URL url = new URL("https://kapi.kakao.com/v1/payment/ready");
				HttpURLConnection conUrl = (HttpURLConnection) url.openConnection(); // 서버연결
				conUrl.setRequestMethod("POST");
				conUrl.setRequestProperty("Authorization", "KakaoAK 2a8fa233eeb4a2d6e693890488ae4941");
				conUrl.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
				conUrl.setDoOutput(true);
				String params = "cid=TC0ONETIME" +
				        "&partner_order_id=" + paymentInfo.getPseq() +
				        "&partner_user_id=" + paymentInfo.getName() +
				        "&item_name=sonahotel" +
				        "&quantity=1" +
				        "&total_amount=" + paymentInfo.getAmount() +
				        "&tax_free_amount=0" +
				        "&approval_url=http://localhost:8083/biz2/index" +
				        "&cancel_url=http://localhost:8083/biz2/reservation_detail" +
				        "&fail_url=http://localhost:8083/biz2/reservation_detail";
				OutputStream ostream = conUrl.getOutputStream();
				DataOutputStream dstream = new DataOutputStream(ostream);
				dstream.writeBytes(params);
				dstream.close();
				
				int result = conUrl.getResponseCode();
				
				InputStream istream; // 받는애
				if(result == 200) {
					istream = conUrl.getInputStream();
				}else {
					istream = conUrl.getErrorStream();
				}
				InputStreamReader rstream = new InputStreamReader(istream); // 읽는애
				BufferedReader reader = new BufferedReader(rstream);
				return reader.readLine();
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "{\"result\":\"NO\"}";
	}
	
	/*
	public KakaopayApprovalVo kakaopayInfo(String tid, String pg_token, HttpSession session) {
		
		try {
			
			@SuppressWarnings("unchecked") // 형변환 경고 무시
			List<PaymentVO> payment = (List<PaymentVO>) session.getAttribute("paymentInfo");
			PaymentVO paymentInfo = payment.get(0);
			
			URL url = new URL("https://kapi.kakao.com/v1/payment/approve");
			HttpURLConnection conUrl = (HttpURLConnection) url.openConnection();
			conUrl.setRequestMethod("POST");
			conUrl.setRequestProperty("Authorization", "KakaoAK 2a8fa233eeb4a2d6e693890488ae4941");
			conUrl.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
			conUrl.setDoOutput(true);
			String params = "cid=TC0ONETIME" +
					"&tid=" + tid +
			        "&partner_order_id=" + paymentInfo.getPseq() +
			        "&partner_user_id=" + paymentInfo.getName() +
			        "&pg_token=" + pg_token;
			OutputStream ostream = conUrl.getOutputStream();
			DataOutputStream dstream = new DataOutputStream(ostream);
			dstream.writeBytes(params);
			dstream.close();
			
			int result = conUrl.getResponseCode();
			
			InputStream istream; // 받는애
			if(result == 200) {
				istream = conUrl.getInputStream();
			}else {
				istream = conUrl.getErrorStream();
			}
			InputStreamReader rstream = new InputStreamReader(istream); // 읽는애
			BufferedReader reader = new BufferedReader(rstream);
			return reader.readLine();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}*/
	
}
