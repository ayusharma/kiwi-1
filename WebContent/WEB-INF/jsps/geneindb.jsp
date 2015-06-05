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
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/fontawesome/assets/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/custom.css" />
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<nav class="navbar">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<a class="navbar-brand" href="${pageContext.request.contextPath}"><b>KIWI</b></a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">

						<ul class="nav navbar-nav navbar-right">
							<li><a href="https://github.com/oncoblocks" target="_blank"><i class="fa fa-github fa-3x"></i> </a></li>
							<li><a href="${pageContext.request.contextPath}"><i class="fa fa-home fa-3x"></i> </a></li>
							<li><a href="${pageContext.request.contextPath}/geneindb"><i class="fa fa-database fa-3x"></i> </a></li>
						</ul>
					</div>

				</div>
				<!-- /.container-fluid --> </nav>
			</div>
		</div>
		<div class="row">
			<h2 class="text-center">Genes Present In database</h2>
		</div>
		<div class="row" style="margin-top:0px;">
			<div class="col-md-12">
			<c:forEach var="row" items="${genes}">
				<div class="panel panel-success">
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