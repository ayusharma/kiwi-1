<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kiwi</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/custom.css" />
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
			<c:forEach var="row" items="${genes}">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title"><b>Gene ID:</b>  ${row.entrez_gene_id}</h3>
					</div>
					<div class="panel-body"><b>Summary:</b> ${row.summary}</div>
				</div>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>