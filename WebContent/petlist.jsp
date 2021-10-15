<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>펫 정보</title>
</head>
<body>
	<h2>펫 정보</h2>
	<hr>
	<div style="margin: auto;">
		<ul>
			<li>
				<ul class="row">
					<li>견종</li>
					<li>이름</li>
					<li>성별</li>
					<li>몸무게</li>
					<li>생년월일</li>
					<li>중성화</li>
				</ul>
			</li>
		<c:forEach var="vo" items="${plist}">
			<li>
				<ul class="row">
					<li>${vo.pet}</li>
					<li>${vo.p_name}</li>
					<li>${vo.p_gender}</li>
					<li>${vo.p_weight}</li>
					<li>${vo.p_birth}</li>
					<li>${vo.p_neu}</li>
			
				</ul>
			</li>
		</c:forEach>	
		</ul>	
	</div>	
</body>
</html>