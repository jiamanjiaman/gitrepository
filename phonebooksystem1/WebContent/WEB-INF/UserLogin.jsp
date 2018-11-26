<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="pageContext.request.contextPath"/>
<!DOCTYPE html>
<html>
	<head>
		<title>用户登录</title>
	</head>
	<body>
		<form method="post" action="UserLoginResult.jsp">
			<p>
				用户名：
				<input type="text" name="username" size="20">
			</p>
			<p>
				密　码：
				<input type="password" name="password" size="20">
			</p>
			<p>
				<input type="submit" value="登录" name="ok">
				<input type="reset" value="重置" name="cancel">
			</p>
		</form>
	</body>

</html>