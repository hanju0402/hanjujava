<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="i" begin="1" end="10">
		<c:if test="${ i % 2 == 0 }">
			<p>${ i }</p>
		</c:if>
	</c:forEach>
	<hr/>
	<c:choose>
		<c:when test="false">
			<p>첫번째 조건이 참일때</p>
		</c:when>
		<c:when test="false">
			<p>두번째 조건이 참일때</p>
		</c:when>
		<c:otherwise>
			<p>모든 조건이 참이 아닐때</p>
		</c:otherwise>
	</c:choose>
</body>
</html>