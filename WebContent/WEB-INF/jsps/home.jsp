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
		select id, entrez_gene_id, summary from GENE_ANNOTATION
	</sql:query>
	
	<c:forEach var="row" items="${rs.rows}">
    ID: ${row.id}<br/>
    Gene ID: ${row.entrez_gene_id}<br/>
    Summary: ${row.summary}
</c:forEach>
</body>
</html>