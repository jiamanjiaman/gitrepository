<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="pageContext.request.contextPath"/>
<!DOCTYPE html>
<html>
	<head>
		<title>登录结果</title>
	</head>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		out.println("username:"+username+"<br>");
		out.println("password:"+password+"<br>");
		
		Cookie cookieUsername=new Cookie("username",username);
		Cookie cookiePassword=new Cookie("password",password);
		//cookieUsername.setMaxAge(30);
		//cookiePassword.setMaxAge(30);
		
		response.addCookie(cookieUsername);
		response.addCookie(cookiePassword);
		
		/*
		Cookie[] cookies=request.getCookies();
		if (cookies!=null){
			for(int i=0;i<cookies.length;i++){
				out.println(cookies[i].getName()+":"+cookies[i].getValue()+"<br>");
			}
		}
		*/
	%>
	<br>
	<a href="UserLoginInfo.jsp">[OK]</a>
</html>