<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>펫 정보 입력</title>
</head>
<body>
	<h1>펫 정보 입력</h1>
	<hr>
	<form name = "petinsert" method="post" action="insert.do">
		<table>
			<tr>
				<th>펫 이름</th>
				<td><input type="text" name="p_name" placeholder="예) 멍뭉이" required></td>
			</tr>
			<tr>
				<th>견종</th>
				<td><input type="text" name="pet" placeholder="예) 웰시 코기" required></td>
			</tr>
			<tr>
				<th>성별</th>
				<td><input type="radio" name="p_gender" value="female" id="female"><label for="female">여자 아이</label>
					<input type="radio" name="p_gender" value="male" id="male"><label for="male">남자 아이</label></td>
			</tr>
			<tr>
				<th>몸무게</th>
				<td><input type="text" name="p_weight" id="p_weight" placeholder="예) 3.2">kg</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td><input type="date" name="p_birth" id="p_birth" value="2020-01-01"></td>
			</tr>	
			<tr>	
				<th>중성화</th>
				<td><input type="radio" name="p_neu" value ="neu" id="neu_y"><label for="neu_y">했어요</label>
					<input type="radio" name="p_neu" value ="noneu" id="neu_n"><label for="neu_n">안했어요</label></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="다음으로" class="btn" onclick="location.href= pet.do">
				<input type="button" value="뒤로가기" onclick="location.href='list.do'" class="btn"></td>
			</tr>			
		</table>
	</form>
</body>
</html>