<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bootstrap 101 Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="${path }/static/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
</head>
<body>
	<form action="${path }/dolike">
		<div class="input-group">
			<input type="text" name="text" placeholder="搜索"
				class="input-sm form-control"> <span class="input-group-btn">
				<button type="submit" class="btn btn-sm btn-primary">搜索</button>
			</span>
		</div>
	</form>
	</div>
	</div>
	<div class="table-responsive">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>id</th>
					<th>用户名</th>
					<th>电话号码</th>
					<th>年龄</th>
					<th>删除<th>
					<th>修改</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${pulist }" var="pu">
					<tr>
						<td>${pu.id}</td>
						<td>${pu.username}</td>
						<td>${pu.phone }</td>
						<td>${pu.age }<td>
						<td type="button"><a href="${path }/dodelete?id=${pu.id }">删除</a></td>
						<td><a href="${path }/toupdate?id=${pu.id }">修改</a></td>
					</tr>

				</c:forEach>
				</tbody>
</table>
				<script src="${path }/static/js/jquery.min.js"></script>
				<script src="${path }/static/js/bootstrap.min.js"></script>
</body>
</html>