<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello Everyone  <a href = "${context}/fetch">Fetch Restaurant</a>

<%-- <h2>All Restaurant List</h2>

	<c:if test="${not empty restList}">

		<ul>
			<c:forEach var="listValue" items="${restList}">
				<li><a href = "${context}/getItems">${listValue.restName}</a></li>
			</c:forEach>
		</ul>

	</c:if> --%>
</body>
</html>