package com.sona.biz.dto;

import lombok.Data;

@Data
public class RoomVO {
	
	private int room_number; // 방번호
	private String room_type; // 룸 타입
	private int cost;// 가격
	private String room_size; // 룸 사이즈
	private String bed_type; // 침대 타입
	private int max_people; // 최대 인원
	private String check_in_time; // 체크인 시간
	private String check_out_time; // 체크아웃 시간
	private String view; // 뷰	

}
