<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	http://localhost:8080/spring-mvc/method/method 를 입력받아서
	WEB-INF/jsp/method/methodForm.jsp 입니다.
	<br>
	<br>
	<br>
	<form action="${pageContext.request.contextPath }/method/method"
		method="POST">
		<input type="submit" value="호출">
	</form>
</body>
</html>