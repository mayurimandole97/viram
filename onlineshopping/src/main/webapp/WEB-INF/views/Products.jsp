<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${userClickTelevision==true}">
	<%@include file="contact.jsp"%>
	</c:if>
	<c:if test="${userClickLaptop==true}">
	<%@include file="contact.jsp"%>
	</c:if>
	<c:if test="${userClickMobile==true}">
	<%@include file="contact.jsp"%>
</c:if>
</body>
</html>