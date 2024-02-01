<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<div class="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
	<div class="booking-form">
		<h3>Booking Your Hotel</h3>
		<form id="reservation" action="reservation-detail" method="POST">
			<div class="check-date">
				<label for="name">이름</label> 
				<input type="text" class="name" id="name" name="name">
			</div>
			<div class="check-date">
				<label for="phone_number">전화번호</label> <input type="text"
					class="phone_number" name="phone" id="phone_number" placeholder="'-' 제외 11자리 입력">
			</div>
			<div class="check-date">
				<label for="email">이메일</label> 
				<input type="email" id="email" name="email" placeholder="sona@example.com">
			</div>
			<div class="check-date">
				<label for="birth">생년월일 (6자리 숫자)</label> 
				<input type="text" class="birth" id="birth" pattern="[0-9]{6}" title="숫자 6자리를 입력하세요."
					required>
			</div>
			<div class="select-option">
			    <label for="room_type">객실 종류</label>
			    <select id="room_type" name="room_type">
			        <option value="그랜드 디럭스 룸" ${room_type == '그랜드 디럭스 룸' ? 'selected' : ''}>그랜드 디럭스 룸</option>
			        <option value="프리미어 룸" ${room_type == '프리미어 룸' ? 'selected' : ''}>프리미어 룸</option>
			        <option value="소나 프리미어 룸" ${room_type == '소나 프리미어 룸' ? 'selected' : ''}>소나 프리미어 룸</option>
			        <option value="디럭스 스위트 룸" ${room_type == '디럭스 스위트 룸' ? 'selected' : ''}>디럭스 스위트 룸</option>
			        <option value="프리미어 스위트 룸" ${room_type == '프리미어 스위트 룸' ? 'selected' : ''}>프리미어 스위트 룸</option>
			        <option value="프레지덴셜 스위트 룸" ${room_type == '프레지덴셜 스위트 룸' ? 'selected' : ''}>프레지덴셜 스위트 룸</option>
			        <option value="로얄 스위트 룸" ${room_type == '로얄 스위트 룸' ? 'selected' : ''}>로얄 스위트 룸</option>
			    </select>
			    <span class="cost" name="cost">${cost}</span>
			</div>
			

			<div class="select-option">
				<label for="view_type">뷰</label> <select id="view_type" name="view_type">
					<option value="view1" ${view_type == '시티' ? 'selected' : ''}>시티</option>
					<option value="view2" ${view_type == '리버' ? 'selected' : ''}>리버</option>
				</select>
			</div>


			<div class="check-date">
				<label for="date-in">체크인</label> <input type="text"
					class="date-input" id="date-in" name="checkin"> <i
					class="icon_calendar"></i>
			</div>
			<div class="check-date">
				<label for="date-out">체크아웃</label> <input type="text"
					class="date-input" id="date-out" name="checkout"> <i
					class="icon_calendar"></i>
			</div>
			<div class="check-date">
				<label for="adults">성인</label> 
				<input type="number" id="adults" class="adults" min="0" max="2" value="0"> 
				<label for="children">아동</label>
				<input type="number" id="children" class="children" min="0" max="2" value="0">

			</div>
			<div class="select-option">
				<label for="pet" class="petsub">반려동물</label> 
				<input type="checkbox" class="pet" id="pet">
			</div>
			

			<button type="submit" onclick="go_save()">예약 하기</button>
		</form>
	</div>
</div>

<%@ include file="footer.jsp"%>
