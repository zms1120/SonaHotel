<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.sona.biz.dto.RoomVO" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="header.jsp" %>
<% List<RoomVO> rooms = new ArrayList<>(); %>
<!-- Breadcrumb Section Begin -->
<div class="breadcrumb-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb-text">
                    <h2>Our Rooms</h2>
                    <div class="bt-option">
                        <a href="./home.html">Home</a>
                        <span>Rooms</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Section End -->

<!-- Rooms Section Begin -->
<section class="rooms-section spad">
    <div class="container">
        <div class="row">
            <!-- 반복문을 통해 각 RoomVO를 가져와서 표시 -->
            <c:forEach var="room" items="${rooms}">
                <div class="col-lg-4 col-md-6">
                    <div class="room-item">
                        <img src="<c:url value='/img/room/${room.room_number}.jpg' />" alt="Room Image">
                        <div class="ri-text">
                            <h4>${room.room_type}</h4>
                            <h3>${room.cost}</h3>
                            <table>
                                <tbody>
                                    <tr>
                                        <td class="r-o">면적</td>
                                        <td>${room.room_size}</td>
                                    </tr>
                                    <tr>
                                        <td class="r-o">투숙인원</td>
                                        <td>Max person ${room.max_people}</td>
                                    </tr>
                                    <tr>
                                        <td class="r-o">침대타입</td>
                                        <td>${room.bed_type}</td>
                                    </tr>
                                    <tr>
                                        <td class="r-o">전망</td>
                                        <td>${room.view_type}</td>
                                    </tr>
                                </tbody>
                            </table>
                            <a href="room_detail?room_number=${room.room_number}" class="primary-btn">More Details</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</section>
<!-- Rooms Section End -->

<%@ include file="footer.jsp" %>
