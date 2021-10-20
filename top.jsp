<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    <style>
	@import url('https://fonts.googleapis.com/css2?family=Gugi&display=swap');
	</style>
	<link rel= "stylesheet" href="top.css?v=3">
    <a class="home" href="/home.jsp">개잘돌봄</a>
    <a class="login" href="/login.do">로그인</a>
    <a class="register" href="/register.do">회원가입</a>
    <nav class="navMenu"> <!-- 의미(semantic)가있는 태그 -->
       	<!-- <li><a class="home" href="/home.jsp">개잘돌봄</a></li> -->
        <a class="menu" href="/petsitter.do">펫시터 찾기</a>
        <a class="menu" href="/review.do">후기 게시판</a>
        <a class="menu" href="/qna.do">이용 문의</a>
        <a class="menu" href="https://forms.gle/pXuxMHSjdb5edSr5A">
        		펫시터 지원</a>
       	<div class="dot"></div>
        		

    	<%-- <li id="login" >
    		<c:if test="${sessionScope.user == null }">
		<a href="login.do" class="menu">로그인</a>
			<!-- <a href="./login.do">로그인</a> -->  <!-- 현재경로 freeboard 에서 login.do -->
			<!-- <a href="/login.do">로그인</a> -->   <!-- root context 에서 login.do -->
			</c:if>
				<c:if test="${sessionScope.user != null }">
				<!-- 로그인된 상태 -->
				<br>${user.name }(${user.email })  님 반갑습니다. <br>
				<a href="logout.do" class="menu">로그아웃</a>
			</c:if>
    	</li> --%>
 
    </nav> 