package com.sona.biz.dto;

import lombok.Data;

@Data
public class PackageVO {

	// yes - 1 , no - 0
	private boolean breakfast; // 조식
	private boolean pool; // 수영장
	private boolean dinner; // 저녁
	private boolean happy_hour; // 해피아워
	private boolean pet_care; // pet care 서비스

}
