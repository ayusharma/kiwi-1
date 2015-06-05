<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<body>
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
							<li><a href="https://github.com/oncoblocks" target="_blank"><i
									class="fa fa-github fa-3x"></i> </a></li>
							<li><a href="${pageContext.request.contextPath}"><i
									class="fa fa-home fa-3x"></i> </a></li>
						</ul>
					</div>

				</div>
				<!-- /.container-fluid --> </nav>
			</div>
		</div>
		<div class="row" style="margin-top: 75px;">
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-success">
					<div class="panel-heading">
						<h3 class="panel-title">
							<b>You have submitted</b>
						</h3>
					</div>
					<div class="panel-body">

					</div>
				</div>
				<!-- 
				<form method="post"
					action="${pageContext.request.contextPath}/entergeneinfo">
					<input name="entrez_gene_id" type="text"> <input
						name="summary" type="text"> <input value="Enter GeneID"
						type="submit">
				</form>
				 -->
			</div>
			<div class="col-md-6 col-md-offset-3">
				<div class="panel panel-success">
					<div class="panel-heading">
						<h3 class="panel-title">
							<b>Tip:</b>
						</h3>
					</div>
					<div class="panel-body">A Gene ID is an integer value that
						uniquely identifies a gene. For example, 672 specifies the BRCA1
						Human Gene. And extract data from http://www.ncbi.nlm.nih.gov/ and
						update the database.</div>
				</div>

			</div>
		</div>
	</div>
	<div class="footer">
		A Project under <a href="https://github.com/oncoblocks">Oncoblocks.org</a>
	</div>
</body>
</html>