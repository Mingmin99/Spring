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
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/member/joinForm">회원가입</a>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/stringresponse">스트링ResponseBody</a>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/voresponse">memberVOResponseBody</a>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/volistresponse">멤버리스트</a>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/hello/3">pathVariable</a>
	<br>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/file/uploadform">FileUpload</a>

	<br> =========================
	<br> request.servletPath : ${pageContext.request.servletPath}
	<br> request.contextPath : ${pageContext.request.contextPath}
	<br>



	<!-- ================================================= -->


	<br>
	<br>
</body>
</html>