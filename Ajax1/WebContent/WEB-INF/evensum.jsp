<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="pageContext.request.contextPath"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>title</title>
	</head>
	<body>
	int sum;
	int i;
	
	public int evensun(int n){
	for(int i=0;i<100;i++){
	if(i%2==0){
	sum=sum + i;
	}
	}
	} 
    alert(sum);
	</body>
</html>