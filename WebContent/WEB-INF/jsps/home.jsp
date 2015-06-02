<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello World  ${ name }
	<br>
	<c:out value="${name}"></c:out>
	
	
	<sql:query var="rs" dataSource="jdbc/spring">
		select id, name, email, text from offers
	</sql:query>
	
	<c:forEach var="row" items="${rs.rows}">
    ID: ${row.id}<br/>
    NAME: ${row.name}<br/>
</c:forEach>
</body>
</html>