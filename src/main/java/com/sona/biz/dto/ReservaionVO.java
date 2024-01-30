package com.sona.biz.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ReservaionVO {
	
	private int id; // 자동으로 설정
	private String phone_number; // 핸드폰 번호
	private String birthday; // 생일
	private int adult; // 어른
	private int children; // 어린이
	private int pet; // 애완동물
	private int extra_bed; // 할까말까
	private Date check_in; // 체크인 날짜
	private Date check_out;  // 체크아웃 날짜

}
