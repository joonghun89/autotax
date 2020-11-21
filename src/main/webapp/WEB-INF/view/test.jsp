<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	
	<link rel='stylesheet' type="text/css" href='/css/uikit.min.css' />
	<link rel='stylesheet' type="text/css" href='/css/common.css' />
</head>
<body>

	<input type="text" value="${userInfo.email}" />
	
	<c:if test="${not empty caseList }">
		<ul>
		<c:forEach var="item" items="${caseList}" varStatus="status">
			<li><c:out value="${item.money}"/></li>
		</c:forEach>
		</ul>
	</c:if>
 
  	
</body>

</html>