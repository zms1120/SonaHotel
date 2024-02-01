 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>    
<body>
    <div class="reservation_detail_main">
        <div class="rd_container">
            <div class="rd_inner">
                <div class="reservation_room_info_area">
                    <div class="room_info">
                        <div class="img_area">
                            <img src="img/textimg.jpg">
                        </div>
                        <div class="txt_area">
                            <li>
                                <span class="type_bold">객실</span>
                                <span class="info_text">그랜드 디럭스 더블 시티뷰</span>
                            </li>
                            <li>
                                <span class="type_bold">투숙 날짜</span>
                                <span class="info_text">2024년 01월 31일 - 2024년 02월 01일 (1박)</span>
                            </li>
                            <li>
                                <span class="type_bold">인원</span>
                                <span class="info_text">성인2, 어린이1</span>
                            </li>
                        </div>
                    </div>
                    <div class="payment_info">
                        <div clas="detail_area">
                            <div class="payment_detail_content">
                                <div class="notice">
                                    <span class="type_bold">요금정책</span>
                                    <span>River View (한강 전망) : 50,000원 추가</span>
                                    <span>Scenic Bath (전망 욕실) : 50,000원 추가</span>
                                    <span>River View & Scenic Bath : 100,000원 추가</span>
                                    <span>※ 객실 타입에 따라 추가 가능한 전망은 상이합니다.</span>
                                </div>
                                <div class="payment_detail_list">
                                    <li>
                                        <p class="type_bold">
                                            <span>객실 요금</span>
                                            <span class="type_bold_gold">(1박)</span>
                                        </p>
                                        <p class="info_price">
                                            <span class="price totalRoomPrice">200,000<span class="won">원</span></span>
                                        </p>
                                    </li>
                                    <li>
                                        <p class="type_bold">
                                            <span>조식</span>
                                        </p>
                                        <p class="info_price">
                                            <span class="price totalRoomPrice">150,000<span class="won">원</span></span>
                                        </p>
                                    </li>
                                    <li>
                                        <p class="type_bold">
                                            <span>수영장</span>
                                        </p>
                                        <p class="info_price">
                                            <span class="price totalRoomPrice">50,000<span class="won">원</span></span>
                                        </p>
                                    </li>
                                </div>
                            </div>
                        </div>
                        <div class="amount_area">
                            <span class="type_bold_amount">총 요금</span>
                            <span class="type_bold_amount amount">400,000<span class="amount_won">원</span>
                        </div>
                    </div>
                </div>

                <div class="reservation_user_info_area">
                    <div class="user_info_wrap">
                        <p class="subject_area">예약자 정보</p>
                        <div class="content_area">
                            <div class="user_info">
                                <ul>
                                    <li>
                                        <span class="type_bold">이름</span>
                                        <span class="info_text">${name}</span>
                                    </li>
                                </ul>
                            </div>
                            <div class="user_info">
                                <ul>
                                    <li>
                                        <span class="type_bold">연락처</span>
                                        <span class="info_text">${phone}</span>
                                    </li>
                                    <li>
                                        <span class="type_bold">이메일</span>
                                        <span class="info_text">${email}</span>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

<%@ include file="../footer.jsp" %>   