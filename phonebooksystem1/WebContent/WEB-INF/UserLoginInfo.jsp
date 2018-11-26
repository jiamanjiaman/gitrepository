<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="pageContext.request.contextPath"/>
<!DOCTYPE html>
<html>
	<head>
		<title>登录信息</title>
	</head>
	<%
		Cookie[] cookies=request.getCookies();
		if (cookies!=null){
			for(int i=0;i<cookies.length;i++){
				out.println(cookies[i].getName()+":"+cookies[i].getValue()+"<br>");
			}
		}
	%>
</html>