<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link type="text/css"
	href="../../resources/css/bootstrap-responsive.min.css"
	rel="StyleSheet">
<link type="text/css" href="../../resources/css/bootstrap.min.css"
	rel="StyleSheet">
<link type="text/css" href="../../resources/css/petstore.css"
	rel="StyleSheet">
<script type="text/javascript" src="../../resources/js/jquery-1.9.1.js"></script>
<script type="text/javascript">
	$(function() {
		//alert("faef");
	});
</script>
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="muted">
				<a href="/petstore/catalog/">Pet Store</a>
			</h3>
			<div class="navbar">
				<div class="navbar-inner">
					<div class="container">
						<ul class="nav">
							<li id="Fish"><a href="../category/Fish">Fish</a></li>
							<li id="Dogs"><a href="../category/Dogs">Dogs</a></li>
							<li id="Reptiles"><a href="../category/Reptiles">Reptiles</a></li>
							<li id="Cats"><a href="../category/Cats">Cats</a></li>
							<li id="Birds"><a href="../category/Birds">Birds</a></li>
						</ul>
					</div>
				</div>
			</div>
			<!-- /.navbar -->
		</div>
		<div class="row-fluid">
			<div class="span12">
				<h2>${product }</h2>
				<table class="table table-striped">
					<tr>
						<th>Item ID</th>
						<th>Product ID</th>
						<th>Description</th>
						<th>List Price</th>
					</tr>

					<c:forEach var="item" items="${itemList }" varStatus="status">
						<tr>
							<td><a href="../item/${item.itemId }">${item.itemId }</a></td>
							<td>${productId }</td>
							<td>${item.attribute1 } ${item.attribute2 }
								${item.attribute3 } ${item.attribute4 } ${item.attribute5 }
								${product }</td>
							<td>${item.listPrice }</td>
						</tr>
					</c:forEach>
				</table>
			</div>

		</div>
	</div>
</body>
</html>