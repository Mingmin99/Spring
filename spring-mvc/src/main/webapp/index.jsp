<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	인덱스
	<br>
	<br>
	<br>
	<a href="<%=request.getContextPath()%>> /hello/hello">
		HelloController</a>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath } /hello/hello">HelloController</a>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath }/method/method">
		method/method</a>
	<!-- ================================================= -->

	request.servletPath : ${pageContext.request.servletPath }
	<br>
	<br> request.contextPath : ${pageContext.request.contextPath}
	<br>
	<br>
</body>
</html>