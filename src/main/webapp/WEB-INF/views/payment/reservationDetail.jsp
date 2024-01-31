
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Add jQuery library -->
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script src="https://cdn.kakaopay.com/kakaopay/assets/kakaopay.v2.js"></script>
<script src="https://cdn.kakaopay.com/kakaopay/assets/inipay/kakaopay-1.0.0.min.js"></script>

<!-- Blog Details Hero Section Begin -->
<section class="blog-details-hero set-bg"
    data-setbg="img/blog/blog-details/blog-details-hero.jpg">
    <div class="container">
        <div class="row">
            <div class="col-lg-10 offset-lg-1">
                <div class="bd-hero-text">
                    <span>Travel Trip & Camping</span>
                    <h2>Cdc Issues Health Alert Notice For Travelers To Usa From Hon</h2>
                    <ul>
                        <li class="b-time"><i class="icon_clock_alt"></i> 15th April, 2019</li>
                        <li><i class="icon_profile"></i> Kerry Jones</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Blog Details Hero End -->

<!-- Blog Details Section Begin -->
<section class="blog-details-section">
    <div class="leave-comment">
        <h4>예약정보</h4>
        <h4>이름 : ${paymentVO[0].name}</h4>
        <h4>연락처 : ${paymentVO[0].phone_number}</h4>
        <h4>예약번호 : ${paymentVO[0].rseq}</h4>
        <h4>총 요금 : ${paymentVO[0].amount}</h4>
        <input type="hidden" name="reservationId" value="${paymentVO[0].rseq}">
        <!-- Add the script tag for your JavaScript code -->
        <button type="submit" id="apibtn" class="site-btn">결제하기</button>
	</div>
</section>
<!-- Blog Details Section End -->

<%@ include file="../footer.jsp"%>
		<script>
			$(function() {
				$('#apibtn').click(function() {
					$.ajax({
						url : '/biz2/kakaopay',
						dataType : 'json',
						success : function(data) {
							var box = data.next_redirect_pc_url;
							window.open(box);
						},
						error : function(error) {
							alert(error);
						}
					});
				});
			});
		</script>
		