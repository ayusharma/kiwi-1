<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kiwi</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/fontawesome/assets/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/css/custom.css" />
</head>
<body
	style="background: url('${pageContext.request.contextPath}/static/images/kiwi.jpg') no-repeat center center fixed; -webkit-background-size: cover;-moz-background-size: cover;-o-background-size: cover;background-size: cover;
">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<nav class="navbar">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="${pageContext.request.contextPath}"><b>KIWI</b></a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">

						<ul class="nav navbar-nav navbar-right">
							<li><a href="https://github.com/oncoblocks" target="_blank"><i class="fa fa-github fa-3x"></i> </a></li>
							<li><a href="${pageContext.request.contextPath}"><i class="fa fa-home fa-3x"></i> </a></li>
						</ul>
					</div>

				</div>
				<!-- /.container-fluid --> </nav>
			</div>
		</div>
		<div class="row" style="margin-top: 150px;">
			<div class="col-md-12">
				<div class="jumbotron text-center">
					<h1>
						<b>KIWI</b>
					</h1>
					<p>
						<b>A simple open source, web based tool for annotating
							mutations in cancer. </b>
					</p>
					<p>
						<a class="btn btn-success btn-lg"
							href="${pageContext.request.contextPath}/geneform" role="button">Use
							Tool</a> <a class="btn btn-success btn-lg" href="#" role="button">About
							Project</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		A Project under <a href="https://github.com/oncoblocks">Oncoblocks.org</a>
	</div>
</body>
</html>